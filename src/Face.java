import java.util.Scanner;
class Face{
		int tl,tm,tr,ml,mm,mr,bl,bm,br;
		Face(){
			tl=tm=tr=ml=mm=mr=bl=bm=br=0;
		}

		void init(){
			Scanner in=new Scanner(System.in);
			System.out.println("Enter integer for each color:\n1.Blue\n2.Red\n3.Green\n4.Orange\n5.Yellow\n6.White");
			System.out.println("Enter top left:");
			tl=in.nextInt();
			System.out.println("Enter top middle:");
			tm=in.nextInt();
			System.out.println("Enter top right:");
			tr=in.nextInt();
			System.out.println("Enter middle left:");
			ml=in.nextInt();
			System.out.println("Enter middle middle:");
			mm=in.nextInt();
			System.out.println("Enter middle right:");
			mr=in.nextInt();
			System.out.println("Enter bottom left:");
			bl=in.nextInt();
			System.out.println("Enter bottom middle:");
			bm=in.nextInt();
			System.out.println("Enter bottom right:");
			br=in.nextInt();
			in.close();
		}

		void display(){
			System.out.println();
			System.out.println(tl+" "+tm+" "+tr);
			System.out.println(ml+" "+mm+" "+mr);
			System.out.println(bl+" "+bm+" "+br);
		}
	}