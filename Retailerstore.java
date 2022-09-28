package oopsassignment;
import java.util.*;
public class Retailerstore {

static int billId=1;
static int customerId=1;
static int purchaseId=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int discount=10;
		HashMap<Integer,Integer>hm=new HashMap<Integer,Integer>();
		hm.put(5001, 50);
		hm.put(5002, 30);
		hm.put(5003,200);
		hm.put(5004, 304);
		hm.put(5005,500);
		System.out.println("enter the number of items purchased by the customer");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int totalBill=0;
		while(n-->0)
		{
			System.out.println("enter the item id purchased by the customer");
			int id=sc.nextInt();
			System.out.println("enter the quantity purchased in KGS");
			int quantity=sc.nextInt();
			if(!hm.containsKey(id)) {
				System.out.println("item not found");
		
			}
			else
			{
				totalBill+=quantity*hm.get(id);
			}
	
		}
		totalBill=totalBill-totalBill*(10/100);
		System.out.println("Bill Id:"+billId);
		System.out.println("customerId "+customerId);
		System.out.println("purchaseId "+purchaseId);
		System.out.println("Total Bill"+totalBill);

	}

}
