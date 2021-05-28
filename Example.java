class Example {
    public static void main(String[] args) {
        NightStudent s1 = new NightStudent("Alireza Yahyapour", "Computer Science");

        s1.add_course("Math", 18.4);
        s1.add_course("Programming", 19.5);
        s1.add_course("History", 17.24);

        System.out.println(s1.information());
        System.out.println(s1.avg_calculate());
    }
}