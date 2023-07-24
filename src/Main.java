public class Main {
    public static void main(String[] args)
    {
Sheep sheep1=new Sheep(20,2,"male","sheep1");
Sheep sheep2=new Sheep(25,3,"female","sheep2");
Sheep sheep3=new Sheep(30,4,"male","sheep3");
Sheep sheep4=new Sheep(35,5,"female","sheep4");
Sheep[]sheep={sheep1,sheep2,sheep3};
Sheep[]sheeps={sheep4};

Cow cow1=new Cow(50,1,"female","cow1");
Cow cow2=new Cow(45,2,"male","cow2");
Cow cow3=new Cow(65,4,"male","cow3");
Cow cow4=new Cow(60,2,"female","cow4");
Cow cow5=new Cow(70,4,"male","cow5");
Cow cow6=new Cow(75,2,"female","cow6");
Cow[]cows={cow1,cow2,cow3,cow4,cow5};
Cow[]cows1={cow6};

Horse horse1=new Horse(90,3,"male","horse1");
Horse horse2=new Horse(80,4,"male","horse2");
Horse horse3=new Horse(85,1,"male","horse3");
Horse[]horses={horse2,horse3};
Horse[]horsess={horse1};

Farm1 farm1=new Farm1("K street","Michael",cows,horses,sheep);
        System.out.println(farm1);
        Farm2 farm2=new Farm2("S street","Adan",cows1,horsess,sheeps);
        System.out.println(farm2);
        
    }
}