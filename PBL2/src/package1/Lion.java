package package1;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    String validate() {
        if (name == null || name.trim().isEmpty()) {
            return "이름은 비어 있을 수 없습니다.";
        }

        if (major == null || major.trim().isEmpty()) {
            return "전공은 비어 있을 수 없습니다.";
        }

        if (generation < 1) {
            return "기수는 1 이상이어야 합니다.";
        }

        return null;
    }

    public String info() {
        return "이름: " + name + " | 전공: " + major + " | 기수: " + generation;
    }

}
