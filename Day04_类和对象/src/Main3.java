
public class Main3 {
	public static void main(String[] args) {
		Hero 盖伦 = new Hero();
		
		盖伦.name = "德玛西亚之力";
		盖伦.country = "诺克萨斯";
		盖伦.race = "约德尔人";
		盖伦.gender = "男";
		
		Hero 弗拉基米尔 = new Hero();
		弗拉基米尔.name = "猩红收割者";
		弗拉基米尔.country = "俄罗斯";
		弗拉基米尔.race = "战斗民族";
		弗拉基米尔.gender = "男";
		
		盖伦.playWith(弗拉基米尔.name);
	}
}
