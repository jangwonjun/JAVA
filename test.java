class test{
    public static void main(String[] args){
        String a = "HAPPY WONJUN";
        int b = 0;
        String c = "123";
        String[] week = {"월","화","수","목","금"};

        week[b] = "우웩";

        System.out.println(week[b]);
        StringBuilder result = new StringBuilder();

        for(int i = 0; i<5; i++){
           result.append(week[i]);
        }

        System.out.println(result);
        System.out.println(result.toString());
    }

}