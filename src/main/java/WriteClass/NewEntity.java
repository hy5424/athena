package WriteClass;

public class NewEntity {

    // 数据库表名
    public static String entityName = "pet_video";

    public static void main(String[] args) {
        new WriteEntity().Write(entityName.trim());
    }
}
