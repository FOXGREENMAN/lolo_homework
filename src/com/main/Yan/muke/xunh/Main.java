package com.main.Yan.muke.xunh;

public class Main {
    public static void main(String[] args) {
        int lie = 1;
        for (int hang = 1; hang<=9;) {
            System.out.print(lie+"*"+hang+"="+lie*hang+"\t");
//  当列的数值大于等于行 那么就进行一次换行，然后重置列的数值为1，再让行的值进行自增
            if(lie>=hang){
                System.out.println();
                lie=1;
                hang++;
            }
//  否则只有列的数值进行自增且不换行
            else{
                lie++;
            }
        }
    }

}

class Outer
{
    int x = 3;

    void method(final int a)
    {
        final int y = 4;
        class Inner
        {
            void function()
            {
                System.out.println(y);
            }
        }

        new Inner().function();

    }
}


class  InnerClassDemo3
{
    public static void main(String[] args)
    {
        Outer out = new Outer();
        out.method(7);//这句可以编译通过；
        out.method(8);//这句也可以编译通过；
    }

}
