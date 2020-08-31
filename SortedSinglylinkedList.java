package LinkedList;

import java.util.Scanner;

public class SortedSinglylinkedList {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList(); 
        System.out.println("Sıralı Tekli bağlantılı Liste İşlemleri \n");          
        char ch;
              do
        {
            System.out.println("1. Ekleme");
            System.out.println("2. Belirtilen pozisyondan silme");
            System.out.println("3. Boş mu");
            System.out.println("4. Boyut");   
            System.out.println("5. Aramak istediğiniz değer");  
            int choice = scan.nextInt();            
            switch (choice)
            {    
            case 1 : 
                System.out.println("Eklemek istediğiniz elemanı girin");
                list.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Silmek istediğiniz elemanın pozisyonunu girin");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Geçersiz Pozisyon\n");
                else
                    list.deleteAtPos(p);
                break;
            case 3 : 
                System.out.println("Liste Durumu(Boş mu) = "+ list.isEmpty()+"\n");
                break;                   
            case 4 : 
                System.out.println("Liste boyutu= "+ list.getSize() +" \n");
                break;  
            case 5: 
                System.out.println("bulmak istediğin degeri gir  ");
                list.find(scan.nextInt());
                break;  
            default : 
                System.out.println("Yanlış Değer \n ");
                break;   
            }       
            list.display();
            System.out.println("\nDevam etmek için (Evet ise e hayır ise h) basınız\n");
            ch = scan.next().charAt(0);                
        } while (ch != 'e'|| ch == 'E');    

	} 
}
