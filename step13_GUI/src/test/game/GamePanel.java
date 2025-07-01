package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel {
	//필드 선언(지역변수에 있는 값을 참조 불가능)
	Image unitImage, backImage, missileImage;
	//드래곤의 좌표
	int unitX=0;
	int unitY=0;
	
	
	
	int back1Y=0;
	int back2Y=-800;
	
	List<Missile> missileList = new ArrayList<>();
	
	
	//생성자
	public GamePanel() {
		//무언가 준비 작업을 하는 곳
		
		//panel의 크기 설정
		setPreferredSize(new Dimension(500,800));
		
		URL url = getClass().getResource("/images/images/unit1.png");
		
		
		//src/images/images/unit1.png
		unitImage = new ImageIcon(url).getImage();
		backImage = new ImageIcon(getClass().getResource("/images/images/backbg.png")).getImage();
		missileImage = new ImageIcon(getClass().getResource("/images/images/mi2.png")).getImage();
		
		
		
		MouseMotionAdapter adapter = new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				//마우스의 좌표
				int x = e.getX();
				int y = e.getY();
				//마우스의 좌표를 unit의 좌표에 반영하기.
				unitX = x;
				unitY = y;
			}
		};
		//Panel 위에서 마우스 움직임을 처리하기 위한 code
		addMouseMotionListener(adapter);
		
		//Panel 이 포커스를 받을 수 있도록 (key event 처리를 위해)
		setFocusable(true);
		//바로 포커스 추가
		requestFocusInWindow();
		
		//키보드 입력 처리
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				//만일 sapce바를 눌렀을 떄.
				if(e.getKeyCode() == 32) {
					//Missile 객체를 생성해서 현재 unit의 좌표를 담은 다음 List에 누적시키기.
					Missile m = new Missile(unitX, unitY);
					missileList.add(m);
				
				}
			}
		}); 
		
		//panel이 10/1000초 마다 다시 그려지게 하기위한 타이머 설정.
		Timer timer = new Timer(10, e->{
			//Panel 객체의 repaint() 메소드를 호출(결과적으로 painComponent() 메소드가 다시 호출됨.)
			repaint();
		});
		
		timer.start();
		
		
		
		
		
	}//생성자 끝
	
	//Panel에 무언가를 그릴 때 호출되는 메소드
	//Panel이 초기화 될 때 한번 호출되고 그 다음에는 repaint()라는 메소두가 호출될 때 마다 다시 호출된다.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		//메소드의 매개변수에 전달되는 Graphics 객체를 panel에 그림 그릴 수 있는 도구.
		
		g.drawImage(backImage, 0,back1Y,500,800,this);
		g.drawImage(backImage, 0,back2Y,500,800,this);
		
		for(int i = 0; i<missileList.size(); i++) {
			Missile tmp = missileList.get(i);
			g.drawImage(missileImage, tmp.getX()-15,tmp.getY()-20, 30,40,this);
		}
		
		
		
		g.drawImage(unitImage, unitX-50, unitY-50, 100, 100, this);
		
		//미사일의 갯수 표시
		g.setColor(Color.YELLOW);
		g.setFont(new Font("Arial", Font.BOLD, 20));
		g.drawString("Missile: "+missileList.size(),10,20);
		
		//모든 미사일의 y좌표를 감소 시켜서 미사일이 위로 이동하도록 한다.
		for(Missile tmp: missileList) {
			//현재 y좌표에서 10감소 시킨 값을 얻어내서
			int resultY = tmp.getY()-10;
			//해당 객체에 다시 넣어준다.
			tmp.setY(resultY);
			
			//만일 위쪽으로 화면을 벗어난 미사일 객체라면
			if(tmp.getY() <= -20) {
				//제거 하도록 표시해 둔다.
				tmp.setRemove(true);
				
			}
		}
		
		//반복문 돌면서 List에서 제거할 Missile 객체는 제거한다.
		for(int i =0; i<missileList.size(); i++) {
			//i번째 Missile 객체
			Missile tmp = missileList.get(i);
			//만일 i번쨰 미사일 객체가 제거할 객체라면
			if(tmp.isRemove()) {
				//List에서 i번째 item을 제거한다.
				missileList.remove(i);
			}
		}
		
		
		back1Y+=2;//back1Y를 증가시키면 상하로 움직이는 것처럼 보임.
		back2Y+=2;
		   
		if(back1Y >=800) {
			//-800의 좌표로 다ㅣ 보낸다.
			back1Y= -800;
		}
		if(back2Y >=800) {
			back2Y = -800;
		}
		
		
		
		
		
	}

}
