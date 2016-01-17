import java.util.Scanner;
class Cube{
		Face blue,green,red,yellow,orange,white;
		int moves,index;
		String rotation[];
		Cube(){
		blue=new Face();
		red=new Face();
		green=new Face();
		orange=new Face();
		yellow=new Face();
		white=new Face();
		moves=0;
		rotation=new String[100];
		index=0;
		}
		
		
	/*Save State*/	
	void saveCubeState(Cube c){
		    	blue.tl=c.blue.tl;
		    	blue.tm=c.blue.tm;
		    	blue.tr=c.blue.tr;
		    	blue.ml=c.blue.ml;
		    	blue.mm=c.blue.mm;
		    	blue.mr=c.blue.mr;
		    	blue.bl=c.blue.bl;
		    	blue.bm=c.blue.bm;
		    	blue.br=c.blue.br;
		    	
				red.tl=c.red.tl;
		    	red.tm=c.red.tm;
		    	red.tr=c.red.tr;
		    	red.ml=c.red.ml;
		    	red.mm=c.red.mm;
		    	red.mr=c.red.mr;
		    	red.bl=c.red.bl;
		    	red.bm=c.red.bm;
		    	red.br=c.red.br;
		    	
				green.tl=c.green.tl;
		    	green.tm=c.green.tm;
		    	green.tr=c.green.tr;
		    	green.ml=c.green.ml;
		    	green.mm=c.green.mm;
		    	green.mr=c.green.mr;
		    	green.bl=c.green.bl;
		    	green.bm=c.green.bm;
		    	green.br=c.green.br;
		    	
				orange.tl=c.orange.tl;
		    	orange.tm=c.orange.tm;
		    	orange.tr=c.orange.tr;
		    	orange.ml=c.orange.ml;
		    	orange.mm=c.orange.mm;
		    	orange.mr=c.orange.mr;
		    	orange.bl=c.orange.bl;
		    	orange.bm=c.orange.bm;
		    	orange.br=c.orange.br;
		    	
				yellow.tl=c.yellow.tl;
		    	yellow.tm=c.yellow.tm;
		    	yellow.tr=c.yellow.tr;
		    	yellow.ml=c.yellow.ml;
		    	yellow.mm=c.yellow.mm;
		    	yellow.mr=c.yellow.mr;
		    	yellow.bl=c.yellow.bl;
		    	yellow.bm=c.yellow.bm;
		    	yellow.br=c.yellow.br;
		    	
				white.tl=c.white.tl;
		    	white.tm=c.white.tm;
		    	white.tr=c.white.tr;
		    	white.ml=c.white.ml;
		    	white.mm=c.white.mm;
		    	white.mr=c.white.mr;
		    	white.bl=c.white.bl;
		    	white.bm=c.white.bm;
		    	white.br=c.white.br;
		    }
	/*Display State*/
	void display(){
		blue.display();
		red.display();
		green.display();
		orange.display();
		yellow.display();
		white.display();
		
		}

	/*Initialize the Cube to solve*/
	void initialize(){
		int ch;
		boolean valid=false;
		Scanner in=new Scanner(System.in);
		System.out.println("\n\nIntialize each face of cube :");
		do{
		System.out.println("\n1.Blue\n2.Red\n3.Green\n4.Orange\n5.Yellow\n6.White\n7.Display\n8.Exit");
		ch=in.nextInt();
		switch(ch){
			case 1:
			System.out.println("\nBlue Face(keep yellow as top)");
			blue.init();
			break;

			case 2:
			System.out.println("\nRed Face(keep yellow as top)");
			red.init();
			break;

			case 3:
			System.out.println("\nGreen Face(keep yellow as top)");
			green.init();
			break;

			case 4:
			System.out.println("\nOrange Face(keep yellow as top)");
			orange.init();
			break;

			case 5:
			System.out.println("\nYellow Face(keep green as top)");
			yellow.init();
			break;

			case 6:
			System.out.println("\nWhite Face(keep blue as top)");
			white.init();
			break;
			case 7:
				blue.display();
				red.display();
				green.display();
				orange.display();
				yellow.display();
				white.display();
			break;
			case 8:
			valid=validation();
			if(!valid){
				System.out.println("\n\nCube is not valid.Enter a valid cube.");
				ch=0;
			}
			else{
				System.out.println("Hold your cube with blue face as front and yellow as top.");
			}
			break;
			
			default:
			System.out.println("Enter no. from the menu only.");
		}
		}while(ch!=8);
		in.close();
	}

	/*Validation*/
	boolean validation(){
		int b,r,g,o,y,w,ch,chk;
		b=r=g=o=y=w=ch=0;
		if(blue.mm!=1 || red.mm!=2 || green.mm!=3 || orange.mm!=4 || yellow.mm!=5 || white.mm!=6)
			return false;
		else
			b=r=g=o=y=w=ch=1;
		while(ch!=7){
		switch(ch){
			case 1:
				chk=blue.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=blue.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
			break;

			case 2:
				chk=red.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=red.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}

			break;

			case 3:
				chk=green.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=green.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}

			break;

			case 4:
				chk=orange.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=orange.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}

			break;

			case 5:
				chk=yellow.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=yellow.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}

			break;

			case 6:
				chk=white.tl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.tm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.tr;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.ml;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.mr;
				switch(chk){
				case 1:
				b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.bl;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.bm;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}
				
				chk=white.br;
				switch(chk){
				case 1:
					b++;
				break;

				case 2:
				r++;
				break;

				case 3:
				g++;
				break;

				case 4:
				o++;
				break;

				case 5:
				y++;
				break;

				case 6:
				w++;
				break;
				}

			break;

			}
			ch++;
		}
		if(b!=9 || r!=9 || g!=9 || o!=9 || y!=9 || w!=9)
			return false;
		else
			return true;
	
	}

	/*Rotations true for clockwise and false for anti-clockwise*/
	void rotate(boolean clk,char r){
		int stl,stm,str,sml,smr,sbl,sbm,sbr,temp;
		if(clk){
			switch(r){
				/*Clockwise Right*/
				case 'r':
					str=blue.tr;
					smr=blue.mr;
					sbr=blue.br;
					
					blue.tr=white.tr;
					blue.mr=white.mr;
					blue.br=white.br;

					white.br=green.tl;
					white.mr=green.ml;
					white.tr=green.bl;

					green.tl=yellow.br;
					green.ml=yellow.mr;
					green.bl=yellow.tr;

					yellow.tr=str;
					yellow.mr=smr;
					yellow.br=sbr;

					temp=red.tr;
					red.tr=red.tl;
					red.tl=red.bl;
					red.bl=red.br;
					red.br=temp;

					temp=red.tm;
					red.tm=red.ml;
					red.ml=red.bm;
					red.bm=red.mr;
					red.mr=temp;
					
					moves++;
					System.out.println(moves+":Clockwise Right");
					rotation[index++]=moves+":Clockwise Right";
					break;

				/*Clockwise left*/
				case 'l':
					
					stl=blue.tl;
					sml=blue.ml;
					sbl=blue.bl;
					
					blue.tl=yellow.tl;
					blue.ml=yellow.ml;
					blue.bl=yellow.bl;

					yellow.bl=green.tr;
					yellow.ml=green.mr;
					yellow.tl=green.br;

					green.tr=white.bl;
					green.mr=white.ml;
					green.br=white.tl;

					white.tl=stl;
					white.ml=sml;
					white.bl=sbl;

					temp=orange.tr;
					orange.tr=orange.tl;
					orange.tl=orange.bl;
					orange.bl=orange.br;
					orange.br=temp;

					temp=orange.tm;
					orange.tm=orange.ml;
					orange.ml=orange.bm;
					orange.bm=orange.mr;
					orange.mr=temp;

					moves++;
					System.out.println(moves+":Clockwise Left");
					rotation[index++]=moves+":Clockwise Left";
					break;

				/*Clockwise Up*/
				case 'u':
					
					stl=blue.tl;
					stm=blue.tm;
					str=blue.tr;
					
					blue.tl=red.tl;
					blue.tm=red.tm;
					blue.tr=red.tr;

					red.tl=green.tl;
					red.tm=green.tm;
					red.tr=green.tr;

					green.tl=orange.tl;
					green.tm=orange.tm;
					green.tr=orange.tr;

					orange.tl=stl;
					orange.tm=stm;
					orange.tr=str;

					temp=yellow.tr;
					yellow.tr=yellow.tl;
					yellow.tl=yellow.bl;
					yellow.bl=yellow.br;
					yellow.br=temp;

					temp=yellow.tm;
					yellow.tm=yellow.ml;
					yellow.ml=yellow.bm;
					yellow.bm=yellow.mr;
					yellow.mr=temp;
					
					moves++;
					System.out.println(moves+":Clockwise Up");
					rotation[index++]=moves+":Clockwise Up";
					break;

				/*Clockwise Down*/
				case 'd':
					
					sbl=blue.bl;
					sbm=blue.bm;
					sbr=blue.br;
					
					blue.bl=orange.bl;
					blue.bm=orange.bm;
					blue.br=orange.br;

					orange.bl=green.bl;
					orange.bm=green.bm;
					orange.br=green.br;

					green.bl=red.bl;
					green.bm=red.bm;
					green.br=red.br;

					red.bl=sbl;
					red.bm=sbm;
					red.br=sbr;

					temp=white.tr;
					white.tr=white.tl;
					white.tl=white.bl;
					white.bl=white.br;
					white.br=temp;

					temp=white.tm;
					white.tm=white.ml;
					white.ml=white.bm;
					white.bm=white.mr;
					white.mr=temp;
					
					moves++;
					System.out.println(moves+":Clockwise Down");
					rotation[index++]=moves+":Clockwise Down";
					break;

				/*Clockwise Front*/
				case 'f':
					
					str=orange.tr;
					smr=orange.mr;
					sbr=orange.br;
					
					orange.tr=white.tl;
					orange.mr=white.tm;
					orange.br=white.tr;

					white.tl=red.bl;
					white.tm=red.ml;
					white.tr=red.tl;

					red.bl=yellow.br;
					red.ml=yellow.bm;
					red.tl=yellow.bl;

					yellow.br=str;
					yellow.bm=smr;
					yellow.bl=sbr;

					temp=blue.tr;
					blue.tr=blue.tl;
					blue.tl=blue.bl;
					blue.bl=blue.br;
					blue.br=temp;

					temp=blue.tm;
					blue.tm=blue.ml;
					blue.ml=blue.bm;
					blue.bm=blue.mr;
					blue.mr=temp;
					
					moves++;
					System.out.println(moves+":Clockwise Front");
					rotation[index++]=moves+":Clockwise Front";
					break;

				/*Clockwise Back*/
				case 'b':
					
					stl=orange.tl;
					sml=orange.ml;
					sbl=orange.bl;
					
					orange.tl=yellow.tr;
					orange.ml=yellow.tm;
					orange.bl=yellow.tl;

					yellow.tr=red.br;
					yellow.tm=red.mr;
					yellow.tl=red.tr;

					red.br=white.bl;
					red.mr=white.bm;
					red.tr=white.br;

					white.bl=stl;
					white.bm=sml;
					white.br=sbl;

					temp=green.tr;
					green.tr=green.tl;
					green.tl=green.bl;
					green.bl=green.br;
					green.br=temp;

					temp=green.tm;
					green.tm=green.ml;
					green.ml=green.bm;
					green.bm=green.mr;
					green.mr=temp;
					
					moves++;
					System.out.println(moves+":Clockwise Back");
					rotation[index++]=moves+":Clockwise Back";
					break;
			}
		}
		else{
			switch(r){
				/*Anti-Clockwise Right*/
				case 'r':
					str=blue.tr;
					smr=blue.mr;
					sbr=blue.br;
					
					blue.tr=yellow.tr;
					blue.mr=yellow.mr;
					blue.br=yellow.br;

					yellow.br=green.tl;
					yellow.mr=green.ml;
					yellow.tr=green.bl;

					green.tl=white.br;
					green.ml=white.mr;
					green.bl=white.tr;

					white.tr=str;
					white.mr=smr;
					white.br=sbr;

					temp=red.tr;
					red.tr=red.br;
					red.br=red.bl;
					red.bl=red.tl;
					red.tl=temp;

					temp=red.tm;
					red.tm=red.mr;
					red.mr=red.bm;
					red.bm=red.ml;
					red.ml=temp;

					moves++;
					System.out.println(moves+":Anti-Clockwise Right");	
					rotation[index++]=moves+":Anti-Clockwise Right";
					break;

				/*Anti-Clockwise Left*/
				case 'l':
					stl=blue.tl;
					sml=blue.ml;
					sbl=blue.bl;
					
					blue.tl=white.tl;
					blue.ml=white.ml;
					blue.bl=white.bl;

					white.bl=green.tr;
					white.ml=green.mr;
					white.tl=green.br;

					green.tr=yellow.bl;
					green.mr=yellow.ml;
					green.br=yellow.tl;

					yellow.tl=stl;
					yellow.ml=sml;
					yellow.bl=sbl;

					temp=orange.tr;
					orange.tr=orange.br;
					orange.br=orange.bl;
					orange.bl=orange.tl;
					orange.tl=temp;

					temp=orange.tm;
					orange.tm=orange.mr;
					orange.mr=orange.bm;
					orange.bm=orange.ml;
					orange.ml=temp;

					moves++;
					System.out.println(moves+":Anti-Clockwise Left");	
					rotation[index++]=moves+":Anti-Clockwise Left";
					break;

				/*Anti-Clockwise Up*/
				case 'u':
					
					stl=blue.tl;
					stm=blue.tm;
					str=blue.tr;
					
					blue.tl=orange.tl;
					blue.tm=orange.tm;
					blue.tr=orange.tr;

					orange.tl=green.tl;
					orange.tm=green.tm;
					orange.tr=green.tr;

					green.tl=red.tl;
					green.tm=red.tm;
					green.tr=red.tr;

					red.tl=stl;
					red.tm=stm;
					red.tr=str;

					temp=yellow.tr;
					yellow.tr=yellow.br;
					yellow.br=yellow.bl;
					yellow.bl=yellow.tl;
					yellow.tl=temp;

					temp=yellow.tm;
					yellow.tm=yellow.mr;
					yellow.mr=yellow.bm;
					yellow.bm=yellow.ml;
					yellow.ml=temp;
					
					moves++;
					System.out.println(moves+":Anti-Clockwise Up");	
					rotation[index++]=moves+":Anti-Clockwise Up";
					break;

				/*Anti-Clockwise Down*/
				case 'd':
					
					sbl=blue.bl;
					sbm=blue.bm;
					sbr=blue.br;
					
					blue.bl=red.bl;
					blue.bm=red.bm;
					blue.br=red.br;

					red.bl=green.bl;
					red.bm=green.bm;
					red.br=green.br;

					green.bl=orange.bl;
					green.bm=orange.bm;
					green.br=orange.br;

					orange.bl=sbl;
					orange.bm=sbm;
					orange.br=sbr;

					temp=white.tr;
					white.tr=white.br;
					white.br=white.bl;
					white.bl=white.tl;
					white.tl=temp;

					temp=white.tm;
					white.tm=white.mr;
					white.mr=white.bm;
					white.bm=white.ml;
					white.ml=temp;
					
					moves++;
					System.out.println(moves+":Anti-Clockwise Down");
					rotation[index++]=moves+":Anti-Clockwise Down";
					break;

				/*Anti-Clockwise Front*/
				case 'f':
					
					str=orange.tr;
					smr=orange.mr;
					sbr=orange.br;
					
					orange.br=yellow.bl;
					orange.mr=yellow.bm;
					orange.tr=yellow.br;

					yellow.bl=red.tl;
					yellow.bm=red.ml;
					yellow.br=red.bl;

					red.tl=white.tr;
					red.ml=white.tm;
					red.bl=white.tl;

					white.tl=str;
					white.tm=smr;
					white.tr=sbr;

					temp=blue.tr;
					blue.tr=blue.br;
					blue.br=blue.bl;
					blue.bl=blue.tl;
					blue.tl=temp;

					temp=blue.tm;
					blue.tm=blue.mr;
					blue.mr=blue.bm;
					blue.bm=blue.ml;
					blue.ml=temp;
					
					moves++;
					System.out.println(moves+":Anti-Clockwise Front");	
					rotation[index++]=moves+":Anti-Clockwise Front";
					break;

				/*Anti-Clockwise Back*/
				case 'b':
					
					stl=orange.tl;
					sml=orange.ml;
					sbl=orange.bl;
					
					orange.tl=white.bl;
					orange.ml=white.bm;
					orange.bl=white.br;

					white.bl=red.br;
					white.bm=red.mr;
					white.br=red.tr;

					red.br=yellow.tr;
					red.mr=yellow.tm;
					red.tr=yellow.tl;

					yellow.tr=stl;
					yellow.tm=sml;
					yellow.tl=sbl;

					temp=green.tr;
					green.tr=green.br;
					green.br=green.bl;
					green.bl=green.tl;
					green.tl=temp;

					temp=green.tm;
					green.tm=green.mr;
					green.mr=green.bm;
					green.bm=green.ml;
					green.ml=temp;
					
					moves++;
					System.out.println(moves+":Anti-Clockwise Back");	
					rotation[index++]=moves+":Anti-Clockwise Back";
					break;

		}

		}
	
	}/*end of rotate*/

	/*Solve the Cube.*/
	int solve(){
		phase1();
		phase2();
		phase3();
		phase4();
		phase5();
		phase6();
		phase7();
		Scanner sc=new Scanner(System.in);
		int ch;
		System.out.println("Press 1 to solve another Cube.\n Press 2 to Exit.");
		ch=sc.nextInt();
		sc.close();
		if(ch==1)
			return 1;
		else
			return 0;
	}/*end of solve*/
	
	/*Phase 1: The White Cross*/
	void phase1(){
	int pass=0,ch;
	System.out.println("\n\nStart of phase 1.\nThis phase will try to get a white cross at the bottom of your cube.");
	int neigh;
	boolean wedge1,wedge2,wedge3,wedge4;
	if(blue.bm==1 && white.tm==6)
		wedge1=true;
	else
		wedge1=false;
	if(red.bm==2 && white.mr==6)
		wedge2=true;
	else
		wedge2=false;
	if(green.bm==3 && white.bm==6)
		wedge3=true;
	else
		wedge3=false;
	if(orange.bm==4 && white.ml==6)
		wedge4=true;
	else
		wedge4=false;
	
	while(!wedge1 || !wedge2 || !wedge3 || !wedge4){
		pass++;
		System.out.println("\n\nPass#:"+pass);
		ch=1;
		while(ch!=7){
			switch(ch){
			case 1:
				if(blue.ml==6){
					neigh=orange.mr;
					if(neigh!=4)
					rotate(false,'l');
					switch(neigh){
					case 1:
						rotate(false,'u');
						if(wedge4==true)
							rotate(true,'l');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge4==true)
							rotate(true,'l');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						if(wedge4==true)
							rotate(true,'l');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(blue.mr==6){
					neigh=red.ml;
					if(neigh!=2)
					rotate(true,'r');
					switch(neigh){
						case 1:
						rotate(true,'u');
						if(wedge2==true)
							rotate(false,'r');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'u');
						if(wedge2==true)
							rotate(false,'r');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge2==true)
							rotate(false,'r');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(blue.tm==6){
					neigh=yellow.bm;
					switch(neigh){
						case 1:
						rotate(false,'u');
						rotate(false,'r');
						rotate(true,'f');
						if(wedge2==true)
							rotate(true,'r');
						wedge1=true;
						break;
						case 2:
						rotate(true,'f');
						rotate(false,'r');
						if(wedge1==true)
							rotate(false,'f');
						wedge2=true;
						break;
						case 3:
						rotate(false,'u');
						rotate(true,'r');
						rotate(false,'b');
						if(wedge2==true)
							rotate(true,'r');
						wedge3=true;
						break;
						case 4:
						rotate(false,'f');
						rotate(true,'l');
						if(wedge1==true)
							rotate(true,'f');
						wedge4=true;
						break;
					}
					}
					else if(blue.bm==6){
						neigh=white.tm;
						switch(neigh){
						case 1:
						rotate(false,'f');
						rotate(true,'r');
						rotate(true,'u');
						if(wedge2==true)
							rotate(false,'r');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'f');
						rotate(false,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'f');
						rotate(true,'r');
						rotate(false,'u');
						if(wedge2==true)
							rotate(false,'r');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'f');
						rotate(true,'l');
						wedge4=true;
						break;
					}
					}
			break;

			case 2:
				if(red.ml==6){
					neigh=blue.mr;
					if(neigh!=1)
					rotate(false,'f');
					switch(neigh){
						case 1:
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						if(wedge1==true)
							rotate(true,'f');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge1==true)
							rotate(true,'f');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						if(wedge1==true)
							rotate(true,'f');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(red.mr==6){
					neigh=green.ml;
					if(neigh!=3)
					rotate(true,'b');
					switch(neigh){
						case 1:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge3==true)
							rotate(false,'b');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						if(wedge3==true)
							rotate(false,'b');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'u');
						if(wedge3==true)
							rotate(false,'b');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(red.tm==6){
					neigh=yellow.mr;
					switch(neigh){
						case 1:
						rotate(false,'r');
						rotate(true,'f');
						if(wedge2==true)
							rotate(true,'r');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						rotate(false,'b');
						rotate(true,'r');
						if(wedge3==true)
							rotate(true,'b');
						wedge2=true;
						break;
						case 3:
						rotate(true,'r');
						rotate(false,'b');
						if(wedge2==true)
							rotate(false,'r');
						wedge3=true;
						break;
						case 4:
						rotate(false,'u');
						rotate(true,'b');
						rotate(false,'l');
						if(wedge3==true)
							rotate(false,'b');
						wedge4=true;
						break;
					}
					}
					else if(red.bm==6){
					neigh=white.mr;
					switch(neigh){
						case 1:
						rotate(true,'r');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'r');
						rotate(true,'b');
						rotate(true,'u');
						if(wedge3==true)
							rotate(false,'b');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'r');
						rotate(false,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'r');
						rotate(true,'b');
						rotate(false,'u');
						if(wedge3==true)
							rotate(false,'b');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
			break;

			case 3:
				if(green.ml==6){
					neigh=red.mr;
					if(neigh!=2)
					rotate(false,'r');
					switch(neigh){
						case 1:
						rotate(true,'u');
						if(wedge2==true)
							rotate(true,'r');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'u');
						if(wedge2==true)
							rotate(true,'r');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge2==true)
							rotate(true,'r');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(green.mr==6){
					neigh=orange.ml;
					if(neigh!=4)
					rotate(true,'l');
					switch(neigh){
						case 1:
						rotate(false,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'l');
						wedge4=true;
						break;
					}
				}
					else if(green.tm==6){
					neigh=yellow.tm;
					switch(neigh){
						case 1:
						rotate(false,'u');
						rotate(true,'l');
						rotate(false,'f');
						if(wedge4==true)
							rotate(false,'l');
						wedge1=true;
						break;
						case 2:
						rotate(false,'b');
						rotate(true,'r');
						if(wedge3==true)
							rotate(true,'b');
						wedge2=true;
						break;
						case 3:
						rotate(true,'b');
						rotate(true,'l');
						rotate(true,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'b');
						rotate(false,'l');
						if(wedge3==true)
							rotate(false,'b');
						wedge4=true;
						break;
					}
					}
					else if(green.bm==6){
						neigh=white.bm;
						switch(neigh){
						case 1:
						rotate(false,'b');
						rotate(true,'l');
						rotate(false,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'b');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'b');
						rotate(true,'l');
						rotate(true,'u');
						if(wedge4==true)
							rotate(false,'l');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'b');
						rotate(false,'l');
						wedge4=true;
						break;
					}
				}
			break;

			case 4:
				if(orange.ml==6){
					neigh=green.mr;
					if(neigh!=3)
					rotate(false,'b');
					switch(neigh){
						case 1:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge3==true)
							rotate(true,'b');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						if(wedge3==true)
							rotate(true,'b');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'u');
						if(wedge3==true)
							rotate(true,'b');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(orange.mr==6){
					neigh=blue.ml;
					if(neigh!=1)
					rotate(true,'f');
					switch(neigh){
						case 1:
						rotate(false,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						if(wedge1==true)
							rotate(false,'f');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'u');
						if(wedge1==true)
							rotate(false,'f');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						if(wedge1==true)
							rotate(false,'f');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(orange.tm==6){
					neigh=yellow.ml;
					switch(neigh){
						case 1:
						rotate(true,'l');
						rotate(false,'f');
						if(wedge4==true)
							rotate(false,'l');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						rotate(true,'f');
						rotate(false,'r');
						if(wedge1==true)
							rotate(false,'f');
						wedge2=true;
						break;
						case 3:
						rotate(false,'l');
						rotate(true,'b');
						if(wedge4==true)
							rotate(true,'l');
						wedge3=true;
						break;
						case 4:
						rotate(false,'u');
						rotate(false,'f');
						rotate(true,'l');
						if(wedge1==true)
							rotate(true,'f');
						wedge4=true;
						break;
					}
					}
					else if(orange.bm==6){
					neigh=white.ml;
					switch(neigh){
						case 1:
						rotate(false,'l');
						rotate(false,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'l');
						rotate(true,'f');
						rotate(false,'u');
						if(wedge1==true)
							rotate(false,'f');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'l');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'l');
						rotate(true,'f');
						rotate(true,'u');
						if(wedge1==true)
							rotate(false,'f');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
			break;

			case 5:
				if(yellow.ml==6){
					neigh=orange.tm;
					switch(neigh){
						case 1:
						rotate(false,'u');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(yellow.mr==6){
					neigh=red.tm;
					switch(neigh){
						case 1:
						rotate(true,'u');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					else if(yellow.tm==6){
					neigh=green.tm;
					switch(neigh){
						case 1:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(false,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
					}
					else if(yellow.bm==6){
					neigh=blue.tm;
					switch(neigh){
						case 1:
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
					}
			break;

			case 6:
				if(white.ml==6){
					neigh=orange.bm;
					if(neigh!=4){
					rotate(false,'l');
					rotate(false,'l');

						switch(neigh){
						case 1:
						rotate(false,'u');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					
				}
					else if(white.mr==6){
					neigh=red.bm;
					if(neigh!=2){
						rotate(false,'r');
						rotate(false,'r');

						switch(neigh){
						case 1:
						rotate(true,'u');
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(false,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					
				}
					else if(white.tm==6){
					neigh=blue.bm;
					if(neigh!=1){
					rotate(false,'f');
					rotate(false,'f');

						switch(neigh){
						case 1:
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
				}
					
					}
					else if(white.bm==6){
					neigh=green.bm;
					if(neigh!=3){
					rotate(false,'b');
					rotate(false,'b');
					switch(neigh){
						case 1:
						rotate(true,'f');
						rotate(true,'f');
						wedge1=true;
						break;
						case 2:
						rotate(false,'u');
						rotate(true,'r');
						rotate(true,'r');
						wedge2=true;
						break;
						case 3:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'b');
						rotate(true,'b');
						wedge3=true;
						break;
						case 4:
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'l');
						wedge4=true;
						break;
					}
					}
				}
			break;
			}
			ch++;
		}
		if(blue.bm==1 && white.tm==6)
		wedge1=true;
		else
		wedge1=false;
		
		if(red.bm==2 && white.mr==6)
		wedge2=true;
		else
		wedge2=false;
		
		if(green.bm==3 && white.bm==6)
		wedge3=true;
		else
		wedge3=false;
		
		if(orange.bm==4 && white.ml==6)
		wedge4=true;
		else
		wedge4=false;
		
	}	

	System.out.println("\n\nEnd of phase 1.\nThis phase marks that a white cross is made at the bottom of your cube with two subsequent colors of blue/orange/green/red on each side.");
	System.out.println("\n\nStart of phase 2.\nThis phase will try to get all white corners at their correct positions.");
	}/*end of phase 1*/
	

	/*Phase 2: The Corners*/
	void phase2(){
	int pass=0,ch,neigh,neigh2;
	boolean cor1 = false,cor2=false,cor3=false,cor4=false;
	do{
	pass++;
	System.out.println("\n\nPass#:"+pass);
	ch=1;
	while(ch!=7){
		switch(ch){
				case 1:
					if(blue.tl==6){
						neigh=orange.tr;
						switch(neigh){
							case 1:
						rotate(false,'u');
						rotate(true,'r');
						rotate(true,'u');
						rotate(false,'r');
							break;

							case 2:
						rotate(false,'u');
						rotate(false,'u');
						rotate(true,'b');
						rotate(true,'u');
						rotate(false,'b');
							break;

							case 3:
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'u');
						rotate(false,'l');
							break;

							case 4:
						rotate(true,'f');
						rotate(true,'u');
						rotate(false,'f');
							break;
						}
					}
					else if(blue.tr==6){
						neigh=red.tl;
						switch(neigh){
							case 1:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'f');
						rotate(false,'u');
						rotate(false,'f');
							break;

							case 2:
						rotate(true,'u');
						rotate(true,'r');
						rotate(false,'u');
						rotate(false,'r');
							break;

							case 3:
						rotate(true,'b');
						rotate(false,'u');
						rotate(false,'b');
							break;

							case 4:
						rotate(false,'u');
						rotate(true,'l');
						rotate(false,'u');
						rotate(false,'l');
							break;
						}
					}
					else if(blue.bl==6){
				rotate(false,'l');
				rotate(true,'u');
				rotate(true,'l');
					}
					else if(blue.br==6){
				rotate(true,'r');
				rotate(true,'u');
				rotate(false,'r');
					}
				break;

				case 2:
					if(red.tl==6){
						neigh=blue.tr;
						switch(neigh){
							case 1:
						rotate(true,'u');
						rotate(false,'f');
						rotate(false,'u');
						rotate(true,'f');
							break;

							case 2:
						rotate(false,'u');
						rotate(true,'b');
						rotate(true,'u');
						rotate(false,'b');
							break;

							case 3:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'l');
						rotate(true,'u');
						rotate(false,'l');
							break;

							case 4:
						rotate(false,'l');
						rotate(true,'u');
						rotate(true,'l');
							break;
						}
					}
					else if(red.tr==6){
						neigh=green.tl;
						switch(neigh){
							case 1:
						rotate(false,'u');
						rotate(true,'f');
						rotate(false,'u');
						rotate(false,'f');
							break;

							case 2:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'r');
						rotate(false,'u');
						rotate(false,'r');
							break;

							case 3:
						rotate(true,'u');
						rotate(true,'b');
						rotate(false,'u');
						rotate(false,'b');
							break;

							case 4:
						rotate(true,'l');
						rotate(false,'u');
						rotate(false,'l');
							break;
						}
					}
					else if(red.bl==6){
				rotate(false,'f');
				rotate(true,'u');
				rotate(true,'f');
					}
					else if(red.br==6){
				rotate(true,'b');
				rotate(true,'u');
				rotate(false,'b');
					}
				break;

				case 3:
					if(green.tl==6){
						neigh=red.tr;
						switch(neigh){
							case 1:
						rotate(false,'f');
						rotate(true,'u');
						rotate(true,'f');
							break;

							case 2:
						rotate(true,'b');
						rotate(true,'u');
						rotate(false,'b');
							break;

							case 3:
						rotate(false,'u');
						rotate(true,'l');
						rotate(true,'u');
						rotate(false,'l');
							break;

							case 4:
						rotate(false,'l');
						rotate(false,'u');
						rotate(false,'u');
						rotate(true,'l');
							break;
						}
					}
					else if(green.tr==6){
						neigh=orange.tl;
						switch(neigh){
							case 1:
						rotate(true,'f');
						rotate(false,'u');
						rotate(false,'f');
							break;

							case 2:
						rotate(false,'u');
						rotate(true,'r');
						rotate(false,'u');
						rotate(false,'r');
							break;

							case 3:
						rotate(true,'u');
						rotate(false,'r');
						rotate(false,'u');
						rotate(true,'r');
							break;

							case 4:
						rotate(true,'u');
						rotate(true,'l');
						rotate(false,'u');
						rotate(false,'l');
							break;
						}
					}
					else if(green.bl==6){
				rotate(false,'r');
				rotate(true,'u');
				rotate(true,'r');
					}
					else if(green.br==6){
				rotate(true,'l');
				rotate(true,'u');
				rotate(false,'l');
					}

				break;

				case 4:
					if(orange.tl==6){
						neigh=green.tr;
						switch(neigh){
							case 1:
						rotate(false,'u');
						rotate(false,'u');
						rotate(true,'r');
						rotate(true,'u');
						rotate(false,'r');
							break;

							case 2:
						rotate(false,'r');
						rotate(true,'u');
						rotate(true,'r');
							break;

							case 3:
						rotate(true,'l');
						rotate(true,'u');
						rotate(false,'l');
							break;

							case 4:
						rotate(false,'u');
						rotate(true,'f');
						rotate(true,'u');
						rotate(false,'f');
							break;
						}
					}
					else if(orange.tr==6){
						neigh=blue.tl;
						switch(neigh){
							case 1:
						rotate(true,'u');
						rotate(true,'f');
						rotate(false,'u');
						rotate(false,'f');
							break;

							case 2:
						rotate(true,'r');
						rotate(false,'u');
						rotate(false,'r');
							break;

							case 3:
						rotate(true,'b');
						rotate(false,'u');
						rotate(false,'u');
						rotate(false,'b');
							break;

							case 4:
						rotate(true,'u');
						rotate(true,'u');
						rotate(true,'l');
						rotate(false,'u');
						rotate(false,'l');
							break;
						}
					}
					else if(orange.bl==6){
				rotate(false,'b');
				rotate(true,'u');
				rotate(true,'b');
					}
					else if(orange.br==6){
				rotate(true,'f');
				rotate(true,'u');
				rotate(false,'f');
					}
				break;

				case 5:
					if(yellow.tl==6){
				rotate(true, 'l');
				rotate(true, 'u');
				rotate(true, 'u');
				rotate(false, 'l');
											}
					else if(yellow.tr==6){
				rotate(true, 'b');
				rotate(true, 'u');
				rotate(true, 'u');
				rotate(false, 'b');
											}
					else if(yellow.bl==6){
				rotate(true, 'f');
				rotate(true, 'u');
				rotate(true, 'u');
				rotate(false, 'f');
					}
					else if(yellow.br==6){
				rotate(true, 'r');
				rotate(true, 'u');
				rotate(true, 'u');
				rotate(false, 'r');
					}

				break;

				case 6:
					if(white.tl==6){
						neigh=orange.br;
						neigh2=blue.bl;
						if(neigh!=4 || neigh2!=1){
					rotate(true, 'f');
					rotate(true, 'u');
					rotate(false, 'f');
						}
						}
					if(white.tr==6){
						neigh=blue.br;
						neigh2=red.bl;
						if(neigh!=1 || neigh2!=2){
					rotate(true, 'r');
					rotate(true, 'u');
					rotate(false, 'r');
						}
											}
					if(white.bl==6){
						neigh=green.br;
						neigh2=orange.bl;
						if(neigh!=3 || neigh2!=4){
					rotate(true, 'l');
					rotate(true, 'u');
					rotate(false, 'l');
						}
					}
					if(white.br==6){
						neigh=red.br;
						neigh2=green.bl;
						if(neigh!=2 || neigh2!=3){
					rotate(true, 'b');
					rotate(true, 'u');
					rotate(false, 'b');
						}
					}

				break;
			}
			ch++;
		}
	
	if(white.tl==6){
		neigh=orange.br;
		neigh2=blue.bl;
		if(neigh==4 && neigh2==1)
			cor1=true;
		else
			cor1=false;
	}
	if(white.tr==6){
		neigh=blue.br;
		neigh2=red.bl;
		if(neigh==1 && neigh2==2)
			cor2=true;
		else
			cor2=false;
							}
	if(white.bl==6){
		neigh=green.br;
		neigh2=orange.bl;
		if(neigh==3 && neigh2==4)
			cor3=true;
		else
			cor3=false;
	}
	if(white.br==6){
		neigh=red.br;
		neigh2=green.bl;
		if(neigh==2 && neigh2==3)
			cor4=true;
		else
			cor4=false;
	}
	}while(!cor1 || !cor2 || !cor3 || !cor4);
	
	System.out.println("\n\nEnd of phase 2.\nThis phase marks that the white corners are all in there correct positions.");
	System.out.println("\n\nStart of phase 3.\nThis phase will try to get all edges of blue/green/red/orange at their correct positions.");
	}/*end of phase 2*/

	/*Phase 3: The Edges*/
	void phase3(){
	boolean edge1=false,edge2=false,edge3=false,edge4=false;
	int rotation=0,pass=0,ch,neigh;
	while(!edge1 || !edge2 || !edge3 || !edge4){
		pass++;
		System.out.println("\n\nPass#:"+pass);
		if(rotation==0 && pass>=2){
			if(!edge1){
				rotate(true, 'u');
				rotate(true, 'f');
				rotate(false, 'u');
				rotate(false, 'f');
				rotate(false, 'u');
				rotate(false, 'l');
				rotate(true, 'u');
				rotate(true, 'l');
			}
			if(!edge2){
				rotate(true, 'u');
				rotate(true, 'r');
				rotate(false, 'u');
				rotate(false, 'r');
				rotate(false, 'u');
				rotate(false, 'f');
				rotate(true, 'u');
				rotate(true, 'f');
			}
			if(!edge3){
				rotate(true, 'u');
				rotate(true, 'b');
				rotate(false, 'u');
				rotate(false, 'b');
				rotate(false, 'u');
				rotate(false, 'r');
				rotate(true, 'u');
				rotate(true, 'r');
			}
			if(!edge4){
				rotate(true, 'u');
				rotate(true, 'l');
				rotate(false, 'u');
				rotate(false, 'l');
				rotate(false, 'u');
				rotate(false, 'b');
				rotate(true, 'u');
				rotate(true, 'b');
				
			}
		}
		else{
			rotation=0;
		}
		ch=1;
	while(ch!=5){
		switch(ch){
			case 1:
				neigh=yellow.bm;
				if(neigh!=5){
					switch(blue.tm){
					case 1:
						if(neigh==2){
							rotation++;
							rotate(true, 'u');
							rotate(true, 'r');
							rotate(false, 'u');
							rotate(false, 'r');
							rotate(false, 'u');
							rotate(false, 'f');
							rotate(true, 'u');
							rotate(true, 'f');
						}
						else if(neigh==4){
							rotation++;
							rotate(false, 'u');
							rotate(false, 'l');
							rotate(true, 'u');
							rotate(true, 'l');
							rotate(true, 'u');
							rotate(true, 'f');
							rotate(false, 'u');
							rotate(false, 'f');
						}
						break;
					case 2:
						rotation++;
							rotate(false, 'u');
						break;
					case 3:
						rotation++;
						rotate(true, 'u');
						rotate(true, 'u');
						break;
					case 4:
						rotation++;
						rotate(true, 'u');
						break;
					}
				
			}				
				break;

			case 2:
				
				neigh=yellow.mr;
				if(neigh!=5){
					switch(red.tm){
					case 1:
						rotation++;
						rotate(true, 'u');
						break;
					case 2:
						if(neigh==1){
							rotation++;
							rotate(false, 'u');
							rotate(false, 'f');
							rotate(true, 'u');
							rotate(true, 'f');
							rotate(true, 'u');
							rotate(true, 'r');
							rotate(false, 'u');
							rotate(false, 'r');
						}
						else if(neigh==3){
							rotation++;
							rotate(true, 'u');
							rotate(true, 'b');
							rotate(false, 'u');
							rotate(false, 'b');
							rotate(false, 'u');
							rotate(false, 'r');
							rotate(true, 'u');
							rotate(true, 'r');
						}
						break;
					case 3:
						rotate(false, 'u');
						rotation++;
						break;
					case 4:
						rotation++;
						rotate(true, 'u');
						rotate(true, 'u');
						break;
					}
				
			}	

			break;

			case 3:
				neigh=yellow.tm;
				if(neigh!=5){
					switch(green.tm){
					case 1:
						rotation++;
						rotate(true, 'u');
						rotate(true, 'u');
						break;
					case 2:
						rotation++;
							rotate(true, 'u');
						break;
					case 3:
						if(neigh==2){
							rotation++;
							rotate(false, 'u');
							rotate(false, 'r');
							rotate(true, 'u');
							rotate(true, 'r');
							rotate(true, 'u');
							rotate(true, 'b');
							rotate(false, 'u');
							rotate(false, 'b');
						}
						else if(neigh==4){
							rotation++;
							rotate(true, 'u');
							rotate(true, 'l');
							rotate(false, 'u');
							rotate(false, 'l');
							rotate(false, 'u');
							rotate(false, 'b');
							rotate(true, 'u');
							rotate(true, 'b');
						}
						break;
					case 4:
						rotation++;
						rotate(false, 'u');
						break;
					}
				
			}	
			break;

			case 4:
				neigh=yellow.ml;
				if(neigh!=5){
					switch(orange.tm){
					case 1:
						rotation++;
						rotate(false, 'u');
						break;
					case 2:
						rotation++;
						rotate(true, 'u');
						break;
					case 3:
						rotation++;
						rotate(true, 'u');
						break;
					case 4:
						if(neigh==1){
							rotation++;
							rotate(true, 'u');
							rotate(true, 'f');
							rotate(false, 'u');
							rotate(false, 'f');
							rotate(false, 'u');
							rotate(false, 'l');
							rotate(true, 'u');
							rotate(true, 'l');
						}
						else if(neigh==3){
							rotation++;
							rotate(false, 'u');
							rotate(false, 'b');
							rotate(true, 'u');
							rotate(true, 'b');
							rotate(true, 'u');
							rotate(true, 'l');
							rotate(false, 'u');
							rotate(false, 'l');
						}
						break;
					}
				
			}	
			break;

		}
		ch++;
		}
	if(blue.ml==1 && orange.mr==4)
		edge1=true;
	else
		edge1=false;
	if(red.ml==2 && blue.mr==1)
		edge2=true;
	else
		edge2=false;
	if(green.ml==3 && red.mr==2)
		edge3=true;
	else
		edge3=false;
	if(orange.ml==4 && green.mr==3)
		edge4=true;
	else
		edge4=false;
	}
	System.out.println("\n\nEnd of phase 3.\nThis phase marks that the edges are all in there correct positions.");
	System.out.println("\n\nStart of phase 4.\nThis phase will try to get a yellow cross at the top of cube.");
	
	
	}/*end of phase 3*/

	/*Phase 4: The Yellow Cross*/
	void phase4(){
	while(yellow.tm!=5 || yellow.bm!=5 || yellow.ml!=5 || yellow.mr!=5){
	if(yellow.tm!=5 && yellow.ml!=5 && yellow.mr!=5 && yellow.bm!=5){
		rotate(true, 'f');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(false, 'u');
		rotate(false, 'f');
	}
	else if((yellow.ml==5 && yellow.mr==5 && yellow.tm!=5 && yellow.bm!=5)){
		rotate(true, 'f');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(false, 'u');
		rotate(false, 'f');
	}
	else if((yellow.ml!=5 && yellow.mr!=5 && yellow.tm==5 && yellow.bm==5)){
		rotate(true, 'l');
		rotate(true, 'f');
		rotate(true, 'u');
		rotate(false, 'f');
		rotate(false, 'u');
		rotate(false, 'l');
	}
	else{
		if(yellow.ml==5 && yellow.tm==5){
			rotate(true, 'f');
			rotate(true, 'r');
			rotate(true, 'u');
			rotate(false, 'r');
			rotate(false, 'u');
			rotate(false, 'f');
		}
		else if(yellow.mr==5 && yellow.tm==5){
			rotate(true, 'l');
			rotate(true, 'f');
			rotate(true, 'u');
			rotate(false, 'f');
			rotate(false, 'u');
			rotate(false, 'l');
		}
		else if(yellow.mr==5 && yellow.bm==5){
			rotate(true, 'b');
			rotate(true, 'l');
			rotate(true, 'u');
			rotate(false, 'l');
			rotate(false, 'u');
			rotate(false, 'b');
		}
		else if(yellow.ml==5 && yellow.bm==5){
			rotate(true, 'r');
			rotate(true, 'b');
			rotate(true, 'u');
			rotate(false, 'b');
			rotate(false, 'u');
			rotate(false, 'r');
		}
	}
	}
	System.out.println("\n\nEnd of phase 4.\nThis phase marks that there is a yellow cross at the top of cube.");
	System.out.println("\n\nStart of phase 5.\nThis phase will try to get all yellow corners at the top of cube.");
	
	
	
	}/*end of phase 4*/

	/*Phase 5: The Yellow Corners*/
	void phase5(){
	while(yellow.tl!=5 || yellow.tr!=5 || yellow.br!=5 ||yellow.bl!=5){
	if(yellow.tr!=5 && yellow.tl!=5 && yellow.br!=5 && yellow.bl!=5){
		while(orange.tr!=5)
			rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(true, 'u');
		rotate(false, 'r');
	}
	else if((yellow.tl==5 && yellow.tr!=5 && yellow.br!=5 && yellow.bl!=5)||(yellow.tl!=5 && yellow.tr==5 && yellow.br!=5 && yellow.bl!=5)||(yellow.tl!=5 && yellow.tr!=5 && yellow.br==5 && yellow.bl!=5)||(yellow.tl!=5 && yellow.tr!=5 && yellow.br!=5 && yellow.bl==5)){
		while(yellow.bl!=5)
			rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(true, 'u');
		rotate(false, 'r');
	}
	else if((yellow.tl==5 && yellow.tr==5 && yellow.bl!=5 && yellow.br!=5)||(yellow.tl!=5 && yellow.tr==5 && yellow.br==5 && yellow.bl!=5)||(yellow.tl!=5 && yellow.tr!=5 && yellow.br==5 && yellow.bl==5)||(yellow.tl==5 && yellow.tr!=5 && yellow.br!=5 && yellow.bl==5)){
		while(yellow.tr!=5 || yellow.tl!=5)
			rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(true, 'u');
		rotate(false, 'r');
	}
	else if((yellow.tl==5 && yellow.tr!=5 && yellow.br==5 && yellow.bl!=5)||(yellow.tl!=5 && yellow.tr==5 && yellow.br!=5 && yellow.bl==5)){
		while(yellow.bl!=5)
			rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(false, 'r');
		rotate(true, 'u');
		rotate(true, 'r');
		rotate(true, 'u');
		rotate(true, 'u');
		rotate(false, 'r');
	}
	}
	System.out.println("\n\nEnd of phase 5.\nThis phase marks that all the cubies at the top are yellow.");
	System.out.println("\n\nStart of phase 6.\nThis phase will try to get all yellow corners at the top of cube.");
	
	
	}/*end of phase 5*/


	/*Phase 6: Correcting The Corners*/
	void phase6(){
	int neigh,neigh2;
	boolean cor1 = false,cor2=false,cor3=false,cor4=false;
	int flag=0;
	while(blue.tr!=1 && flag!=4){
		rotate(false,'u');
		flag++;
	}
	flag=0;
	if(yellow.tl==5){
		neigh=green.tr;
		neigh2=orange.tl;
		if(neigh==3 && neigh2==4)
			cor1=true;
		else
			cor1=false;
	}
	if(yellow.tr==5){
		neigh=red.tr;
		neigh2=green.tl;
		if(neigh==2 && neigh2==3)
			cor2=true;
		else
			cor2=false;
							}
	if(yellow.bl==5){
		neigh=blue.tl;
		neigh2=orange.tr;
		if(neigh==1 && neigh2==4)
			cor3=true;
		else
			cor3=false;
	}
	if(yellow.br==5){
		neigh=blue.tr;
		neigh2=red.tl;
		if(neigh==1 && neigh2==2)
			cor4=true;
		else
			cor4=false;
	}
	if(!cor1 || !cor2 || !cor3 || !cor4){
		if(blue.tr==blue.tl){
				rotate(true, 'r');
				rotate(false, 'b');
				rotate(true, 'r');
				rotate(true, 'f');
				rotate(true, 'f');
				rotate(false, 'r');
				rotate(true, 'b');
				rotate(true, 'r');
				rotate(true, 'f');
				rotate(true, 'f');
				rotate(true, 'r');
				rotate(true, 'r');
		}
		else{
				while(!(blue.tr==blue.tl) && flag<4){
					rotate(false,'u');
					flag++;
				}
				if(flag==4){
					rotate(true, 'r');
					rotate(false, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(false, 'r');
					rotate(true, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(true, 'r');
					rotate(true, 'r');	
					while(!(blue.tr==blue.tl))
						rotate(false,'u');
					rotate(true, 'r');
					rotate(false, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(false, 'r');
					rotate(true, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(true, 'r');
					rotate(true, 'r');	
				}
				else
				{
					rotate(true, 'r');
					rotate(false, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(false, 'r');
					rotate(true, 'b');
					rotate(true, 'r');
					rotate(true, 'f');
					rotate(true, 'f');
					rotate(true, 'r');
					rotate(true, 'r');	
				}
	}
		while(blue.tr!=1)
			rotate(false,'u');
	}
	System.out.println("\n\nEnd of phase 6.\nThis phase marks that all the corners are at correct positions.");
	System.out.println("\n\nStart of phase 7.\nThis phase will complete the cube.");
	}/*end of phase 6*/

	/*Phase 7: The Cube*/
	void phase7(){
		
		while((blue.tm!=1)||(red.tm!=2)||(green.tm!=3)||(orange.tm!=4)){
			if((blue.tm!=1)&&(red.tm!=2)&&(green.tm!=3)&&(orange.tm!=4)){
				rotate(true, 'r');
				rotate(false, 'u');
				rotate(true, 'r');
				rotate(true, 'u');
				rotate(true, 'r');
				rotate(true, 'u');
				rotate(true, 'r');
				rotate(false, 'u');
				rotate(false, 'r');
				rotate(false, 'u');
				rotate(true, 'r');
				rotate(true, 'r');
			}
			if(green.tm==3){
				while(blue.tm!=1 && orange.tm!=4 && red.tm!=2)
				{
					rotate(true, 'r');
					rotate(false, 'u');
					rotate(true, 'r');
					rotate(true, 'u');
					rotate(true, 'r');
					rotate(true, 'u');
					rotate(true, 'r');
					rotate(false, 'u');
					rotate(false, 'r');
					rotate(false, 'u');
					rotate(true, 'r');
					rotate(true, 'r');
				}
			}
			if(blue.tm==1){
				while(green.tm!=3 && orange.tm!=4 && red.tm!=2)
				{
				rotate(true, 'l');
				rotate(false, 'u');
				rotate(true, 'l');
				rotate(true, 'u');
				rotate(true, 'l');
				rotate(true, 'u');
				rotate(true, 'l');
				rotate(false, 'u');
				rotate(false, 'l');
				rotate(false, 'u');
				rotate(true, 'l');
				rotate(true, 'l');
				}
			}
			if(red.tm==2){
				while(blue.tm!=1 && orange.tm!=4 && green.tm!=3)
				{
				rotate(true, 'f');
				rotate(false, 'u');
				rotate(true, 'f');
				rotate(true, 'u');
				rotate(true, 'f');
				rotate(true, 'u');
				rotate(true, 'f');
				rotate(false, 'u');
				rotate(false, 'f');
				rotate(false, 'u');
				rotate(true, 'f');
				rotate(true, 'f');
				}
			}
			if(orange.tm==4){
				while(blue.tm!=1 && green.tm!=3 && red.tm!=2)
				{
				rotate(true, 'b');
				rotate(false, 'u');
				rotate(true, 'b');
				rotate(true, 'u');
				rotate(true, 'b');
				rotate(true, 'u');
				rotate(true, 'b');
				rotate(false, 'u');
				rotate(false, 'b');
				rotate(false, 'u');
				rotate(true, 'b');
				rotate(true, 'b');
				}
			}
		}
		System.out.println("End of phase 7.\nCONGRATS THE CUBE IS COMPLETE IN "+moves+" MOVES");

	}/*end of phase 7*/

}