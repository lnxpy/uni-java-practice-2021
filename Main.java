class Main {
    public static void main(String[] args) {
        
        NightStudent s1 = new NightStudent("Alireza Yahyapour", "Computer Science");

        s1.addCourse("Math", 18.4);
        s1.addCourse("Programming", 19.5);
        s1.addCourse("History", 17.24);

	s1.setAccounting(150000, 45000);

        System.out.println(s1.information());
        System.out.println("Calculated Average : " + s1.avgCalculate());
	    System.out.println(s1.showAccounting());
    }
}
