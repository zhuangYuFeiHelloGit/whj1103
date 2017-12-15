package main;

import bean.User;
import utils.Constants;
import utils.NetTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by zyf on 2017/12/14.
 */
public class Main {

	private static final int DIFFICULT_CODE = 1;
	private static final int MIDDLE_CODE = 2;
	private static final int EASY_CODE = 3;
	private static final int TIMES_DIFFICULT = 30;
	private static final int TIMES_MIDDLE = 20;
	private static final int TIMES_EASY = 10;
	private static List<Character> difficult;
	private static List<Character> middle;
	private static List<Character> easy;
	private static Random random;
	private static Scanner input;
	private static NetTool netTool;
	private static String nickname = "douniwan";


	public static void main(String[] args) {

		initGame();

		input = new Scanner(System.in);
		random = new Random();
		netTool = new NetTool();

		System.out.println("欢迎光临，默认昵称为：douniwan");

		System.out.println("1，开始游戏	2，查询前十");

		int choice = input.nextInt();


		switch (choice) {
			case 1:
				System.out.println("请选择游戏难度：\n\t 1，困难\t2，中等\t3，简单");
				int game = input.nextInt();
				switch (game) {
					case DIFFICULT_CODE:
						startGame(difficult, TIMES_DIFFICULT);
						break;
					case MIDDLE_CODE:
						startGame(middle, TIMES_MIDDLE);
						break;
					case EASY_CODE:
						startGame(easy, TIMES_EASY);
						break;
				}
				break;
			case 2:
				List<User> users = netTool.pullJsonArray(Constants.URL_TEN, User.class);
				for (int i = 0; i < users.size(); i++) {
					User user = users.get(i);
					int index = i + 1;
					System.out.println("第" + index + "名：\t昵称：" + user.getNickname() + "\t成绩：" + user.getScore());
				}
				break;
		}
	}

	private static void initGame() {
		difficult = new ArrayList();
		middle = new ArrayList<>();
		easy = new ArrayList<>();
		//32是空格，126是~
		for (char i = 32; i <= 126; i++) {
			difficult.add(i);
		}

		//小写字母
		for (char i = 97; i <= 122; i++) {
			easy.add(i);
		}
		//数字
		for (char i = 48; i <= 57; i++) {
			easy.add(i);
		}

		middle.addAll(easy);

		//大写字母
		for (char i = 65; i <= 90; i++) {
			middle.add(i);
		}



	}

	public static void startGame(List<Character> cs, int times) {
		StringBuilder game = new StringBuilder();
		for (int i = 0; i < times; i++) {
			int index = random.nextInt(cs.size() - 1);
			game.append(cs.get(index));
		}

		for (int i = 3; i >= 0; i--) {
			if (i == 0) {
				System.out.println("游戏开始：");
			} else {
				System.out.println("倒计时" + i + "秒后开始");
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(game);

		long start = System.currentTimeMillis();

		input.nextLine();
		String receive = input.nextLine();

		if (game.toString().equals(receive)) {
			long end = System.currentTimeMillis();
			long score = end - start;

			Number number = new Long(score);
			int time = number.intValue();

			System.out.println("恭喜您，成绩为：" + time + "毫秒");

			String result = netTool.pushScore(Constants.URL_INSERT, nickname, time);

			if (result.equals("SUCCESS")) {
				System.out.println("成绩以提交成功");
			}

			User user = netTool.pullXml(Constants.URL_FIRST, User.class);
			System.out.println("目前第一名为：" + user.getNickname() + "\t成绩为" + user.getScore());

		} else {
			System.out.println("游戏失败");
		}

	}
}
