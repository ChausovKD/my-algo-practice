package easy.tim_from_marketing;

public class Badge {

    public String print(Integer id, String name, String department) {
        if (department == null) {
            if (id == null) {
                return name + " - " + "OWNER";
            }
            return "[" + id + "] - " + name + " - " + "OWNER";
        }
        if (id == null) {
            return name + " - " + department.toUpperCase();
        }
        return "[" + id + "] - " + name + " - " + department.toUpperCase();
    }

    public static void main(String[] args) {
        Badge badge = new Badge();
        System.out.println(badge.print(734, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge.print(null, "Ernest Johnny Payne", "Strategic Communication"));
        System.out.println(badge.print(null, "Ernest Johnny Payne", null));
    }
}
