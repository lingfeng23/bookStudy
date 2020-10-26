package webDesign.chapter03;

/**
 * @author malf
 * @description 产品接口
 * @project bookStudy
 * @since 2020/10/26
 */
public interface IProductEntity {
	public String getYearMonth(String yearMonth); // 生产年月
	public String getName(String name); // 产品名称
	public String getType(String type); // 产品类型
	public String getBrand(String brand); // 品牌
	public int getValue(int value); // 产品价格
	public String getLocality(String locality); // 产地
	// selectAll 接口方法应该单独放在另一个接口中
	// public String selectAll(String all); // 查询所有信息
}
