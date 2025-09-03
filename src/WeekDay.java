public enum WeekDay {
    MONDAY(1, "Lunes"), 
    TUESDAY(1,"Martes"), 
    WENDNESDAY(3, "Miercoles"), 
    THURSDAY(4,"Jueves"),
    FRIDAY(5,"Viernes"), 
    SATURDAY(6, "Sabado"), 
    SUNDAY(7,"Domingo");

    private Integer num;
    private String name;

    WeekDay(Integer num, String name){
        this.num = num;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return getName();
    }
}