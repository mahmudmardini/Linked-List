package LinkedList;

public class LinkedList {

	Node start;
	public int size;
	
	LinkedList(){
		start = null;
		size =0;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insert(int val)
    {
        Node nptr, ptr, tmp = null;
        nptr = new Node(val, null);
        boolean ins = false;
        if (start == null)
           start = nptr;
        else if (val <= start.getData())
        {
            nptr.setLink(start);
            start = nptr;
        }
        else
        {
            tmp = start;
            ptr = start.getLink();
            while(ptr != null)
            {
                //Araya eleman ekleme
                if (val >= tmp.getData() && val <= ptr.getData())
                {
                    tmp.setLink(nptr);
                    nptr.setLink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    tmp = ptr;
                    ptr = ptr.getLink();
                }
            }
            //Sonuna ekleme
            if (ins == false)
            {
                tmp.setLink(nptr);
               
            }
        }
        size++;
    }
	
	public void deleteAtPos(int pos) {
		// BAŞTAN SİLME
		if(pos == 1){
			start = start.getLink();
			size--;
			return ;
			
		}
		
		// SONUNDAN SİLME 
		if(pos == size){
			Node ptr = start;
			
			for(int i = 1; i < size -1 ; i++) {
				ptr.setLink(null);
				size--;
				return;
			}
		}
		
		// ARADAN SİLME
		
		Node ptr = start;
		pos = pos - 1;
		for(int i = 1; i < size - 1; i++) {
			if(i == pos) {
				Node tmp = ptr.getLink();
				tmp = tmp.getLink();
				ptr.setLink(tmp);
				break;
			}
			ptr = ptr.getLink();
		}
		size--;
	}
	
	 // /*  Function to display elements  
	
	public void display() {
		  System.out.print("Sıralı Tek Yönlü bağlantılı Liste = ");
	        if (size == 0) 
	        {
	            System.out.print("boş\n");
	            return;
	        }
	        if (start.getLink() == null) 
	        {
	            System.out.println(start.getData() );
	            return;
	        }
	        Node ptr = start;
	        System.out.print(start.getData()+ "->");
	        ptr = start.getLink();
	        while (ptr.getLink() != null) {
	            System.out.print(ptr.getData()+ "->");
	            ptr = ptr.getLink();
	        }
	        System.out.print(ptr.getData()+ "\n");
	}
	
	public void find(int val){
	       
	       Node aranan=start;
	       int i=1;
	       boolean flag=false;
	       if(start==null)
	            System.out.println("liste boş");
	       else{
	           while(aranan !=null){
	               if(aranan.getData()==val){
	                   flag=true;
	                   break;
	               }
	               i++;
	               aranan=aranan.next;
	           }
	       }
	       if(flag)
	            System.out.println("Elemanın pozisyonu : "+i);
	       else
	            System.out.println("Eleman listede yok");
	       
	    }
	
	}


	
