import java.util.Scanner;
public class putri{
	public static void main(String[] args){
		Scanner uname=new Scanner(System.in);
		Scanner pw=new Scanner(System.in);

		String nama_pengguna[]={"putri"}, nama; 
		String passwd[]={"202013035"}, sandi;
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                 Aplikassi Sederhana                      ");
		System.out.println("==========================================================");
		System.out.println("Masukkan Nama Pengguna :");
		nama = uname.nextLine();
		System.out.println("Masukkan Sandi");
		sandi=pw.nextLine();

		if (nama.equals(nama_pengguna[0]) && sandi.equals(passwd[0])) {
			Kasir();
		}
		else {
			System.out.println("Maaf Nama Pengguna atau sandi Anda salah");
		}
	}
	static void Kasir(){
		int menu;
		Scanner h1=new Scanner(System.in);
		System.out.println("==========================================================");
		System.out.println("                  Selamat Datang di                       ");
		System.out.println("                     POLKAM MART                          ");
		System.out.println("                        Kasir                             ");
		System.out.println("==========================================================");
		System.out.println("Silahkan pilih menu :");
		System.out.println("1. Menu Penjualan");
		System.out.println("2. Menu Stok");
		System.out.println("3. Menu Tambah Data");
		System.out.println("4. Menu Utama");
		System.out.println("5. Menu Keluar");
		System.out.println("==========================================================");
		menu=h1.nextInt();
		if (menu==1) {
			Penjualan();	
		}
		else if (menu==2){
			Stok();	
		}
		else if (menu==3){
			TambahData();	
		}
		else if (menu==4){
			Kasir();	
		}
		else if (menu==5){
			System.exit(0);	
		}
		else {
			System.out.println("Maaf tidak ada Menu untuk inputan Anda");
			Kasir();
		}
	}
		static void Penjualan(){
			String barang[]={"Popmie", "Es Lilin", "Kerupuk"};
			int harga[]={5000, 1000, 500}, total;
			int jumlah[]=new int[3];
			Scanner h1=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.println("  Nama barang                                   harga       ");
			System.out.println("  "+barang[0]+"                                        Rp."+harga[0]);
			System.out.println("  "+barang[1]+"                                      Rp."+harga[1]);
			System.out.println("  "+barang[2]+"                                       Rp."+harga[2]);
			System.out.print("Masukkan jumlah barang pertama: ");
			jumlah[0]=h1.nextInt();
			System.out.print("Masukkan jumlah barang kedua: ");
			jumlah[1]=h1.nextInt();
			System.out.print("Masukkan jumlah barang ketiga: ");
			jumlah[2]=h1.nextInt();

			total=(harga[0]*jumlah[0])+(harga[1]*jumlah[1])+(harga[2]*jumlah[2]);
			int jmlh;
			jmlh=jumlah[0]+jumlah[1]+jumlah[2];

			System.out.println("     List barang            harga barang         jumlah      ");
			System.out.println("     "+barang[0]+"                 Rp. "+harga[0]+"               "+jumlah[0]);
			System.out.println("     "+barang[1]+"               Rp. "+harga[1]+"               "+jumlah[1]);
			System.out.println("     "+barang[2]+"                Rp. "+harga[2]+"                "+jumlah[2]);
			System.out.println("      Total                                       Rp. "+total);
			System.out.print("Masukkan pembayaran: ");
			int bayar;
			bayar=h1.nextInt();
			System.out.println("Kembalian : Rp. "+(bayar-total));	
			Kasir();
		}
		static void Stok(){
			Scanner pauser=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.println("  Nama barang                                 jumlah      ");
			System.out.println("   Popmie                                       10        ");
			System.out.println("  Es Lilin                                      15        ");
			System.out.println("  Kerupuk                                       20        ");
			System.out.println("==========================================================");
			pauser.nextLine();
			System.out.println("\033[H\033[2J");
			System.out.flush();
			Kasir();
		}
		static void TambahData(){
			Scanner terima=new Scanner(System.in);
			Scanner input=new Scanner(System.in);
			System.out.println("==========================================================");
			System.out.println("                     POLKAM MART                          ");
			System.out.println("                        Kasir                             ");
			System.out.println("==========================================================");
			System.out.print("Masukkan banyaknya data yang ingin di inputkan : ");
			int n=input.nextInt();
			String barang[]=new String[n];
			int harga[]=new int [n];
			int jumlah[]=new int[n];
			for (int i=0;i<n ;i++ ){
				System.out.print("Masukkan Nama barang ke "+(i+1)+" : ");
				barang[i]=terima.nextLine();
				System.out.print("Masukkan Harga barang ke "+(i+1)+" : ");
				harga[i]=input.nextInt();
				System.out.print("Masukkan jumlah barang ke "+(i+1)+" : ");
				jumlah[i]=input.nextInt();
				System.out.println("Penginputan barang ke "+(i+1)+"telah selesai");
				System.out.println("======================================");
			}
			System.out.println();
			int total=0;	
			System.out.println("Barang yang diinputkan adalah sebagai berikut");
			for (int i=0;i<n ;i++ ) {
				System.out.println("Nama barang ke "+(i+1)+" "+barang[i]+"  Harga barang ke "+(i+1)+" "+harga[i]+"  Jumlah barang ke "+(i+1)+" "+jumlah[i]);
				total =total +(harga[i]*jumlah[i]);
			}
			System.out.println("Total harga adalah Rp."+total);	
			Kasir();
		}
}	