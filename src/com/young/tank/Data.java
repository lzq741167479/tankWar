package com.young.tank;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author linzhongqi
 * @data 2019年3月15日
 * 数据类
 * 
 */
public class Data {
	public static final int WINDOW_WIDTH = 600;							 //窗口宽度
	public static final int WINDOW_HEIGHT = 480+30; 					 //窗口高度
	public static final int WINDOW_FPS = 100;    						 //坦克移动速度
	public static final String WINDOW_TITLE = "《坦克大战》 作者：林中奇";   //窗口标题
	public static final Image WINDOW_ICOIMG = Toolkit.getDefaultToolkit().getImage("img/logo.png");		//显示logo
	public static final Image TANK_PLAN = Toolkit.getDefaultToolkit().getImage("img/tankIcon.png");		//模型图集
	public static final Image Start_Img = Toolkit.getDefaultToolkit().getImage("img/tankCover.png");	//开始页面背景图
	
	public static CopyOnWriteArrayList<Material> matarry = new CopyOnWriteArrayList<Material>();
	public static CreateMap create_map = new CreateMap();
	public static TankOther tank_othe;
	public static Material mat;
	
	public static final int TANKE_REGION_MIN_X = 0;				//坦克战斗区域
	public static final int TANKE_REGION_MIN_Y = 0;				//坦克战斗区域
	public static final int TANKE_REGION_MAX_X = 416;			//坦克战斗区域
	public static final int TANKE_REGION_MAX_Y = 416;			//坦克战斗区域
	public static final int MIN_X = 65;
	public static final int MIN_Y = 35;
	public static final int MAX_X = MIN_X + 416;
	public static final int MAX_Y = MIN_Y + 416;
	
	
	public static int start = 3;
	public static int IMGE_x = 4;
	public static int IMGE_y = 5;
	public static int tank_x = 45;
	public static int tank_y = 35;
}
