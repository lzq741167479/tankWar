package com.tank;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author linzhongqi
 * @data 2019��3��15��
 * ������
 * 
 */
public class Data {
	public static final int WINDOW_WIDTH = 600;							 //���ڿ���
	public static final int WINDOW_HEIGHT = 480+30; 					 //���ڸ߶�
	public static final int WINDOW_FPS = 100;    						 //̹���ƶ��ٶ�
	public static final String WINDOW_TITLE = "��̹�˴�ս�� ���ߣ�������";   //���ڱ���
	public static final Image WINDOW_ICOIMG = Toolkit.getDefaultToolkit().getImage("img/logo.png");		//��ʾlogo
	public static final Image TANK_PLAN = Toolkit.getDefaultToolkit().getImage("img/tankIcon.png");		//ģ��ͼ��
	public static final Image Start_Img = Toolkit.getDefaultToolkit().getImage("img/tankCover.png");	//��ʼҳ�汳��ͼ
	
	public static CopyOnWriteArrayList<Material> matarry = new CopyOnWriteArrayList<Material>();
	public static CreateMap create_map = new CreateMap();
	public static Material mat;
	
	public static final int TANKE_REGION_MIN_X = 0;				//̹��ս������
	public static final int TANKE_REGION_MIN_Y = 0;				//̹��ս������
	public static final int TANKE_REGION_MAX_X = 416;			//̹��ս������
	public static final int TANKE_REGION_MAX_Y = 416;			//̹��ս������
	public static final int MIN_X = 65;							//ս��������ʼλ
	public static final int MIN_Y = 35;
	public static final int MAX_X = MIN_X + 416;				//ս��������ʾλ
	public static final int MAX_Y = MIN_Y + 416;
	
	public static int start = 3;
}