/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confoosion;

import java.util.ArrayList;

/**
 *
 * @author shelfinna
 */
public class ListRestaurants {
    ArrayList <Restaurant> listrestaurant = new ArrayList();
     
    public ListRestaurants(){
    // 1. none, 2.no pork, 3.vegan 
    Restaurant DepotMeyMey = new Restaurant ("Indonesian", "Depot Mey Mey", 7, 14, 15000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    DepotMeyMey.addFood("Nasi Campur", 20000);
    DepotMeyMey.addFood("Nasi Kuning", 20000);
    DepotMeyMey.addFood("Nasi Pecel", 15000);
    listrestaurant.add(DepotMeyMey);
    
    Restaurant DepotRameRame = new Restaurant ("Indonesian", "Depot Rame Rame", 7, 14, 12000, 30000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    DepotRameRame.addFood("Nasi Bakmoy", 18000);
    DepotRameRame.addFood("Nasi Campur", 20000);
    DepotRameRame.addFood("Mie Ayam", 15000);
    listrestaurant.add(DepotRameRame);
    
    Restaurant kulinernusantara = new Restaurant ("Indonesian", "Kuliner Nusantara", 7, 14, 25000, 42000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    kulinernusantara.addFood("Soto Udang", 20000);
    kulinernusantara.addFood("Nasi Tim Jakarta", 22000);
    kulinernusantara.addFood("Bakmie Belitung", 30000);
    listrestaurant.add(kulinernusantara);
    
    Restaurant kulinermakassar = new Restaurant ("Indonesian", "Kuliner Makassar", 7, 14, 20000, 37000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    kulinermakassar.addFood("Soto Makassar", 18000);
    kulinermakassar.addFood("Nasi Cumi", 25000);
    kulinermakassar.addFood("Ayam Goreng", 18000);
    listrestaurant.add(kulinermakassar);
    
    Restaurant mingcuan = new Restaurant ("Chinese", "Depot Ming Cuan", 7, 14, 15000, 30000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    mingcuan.addFood("Mie Ayam", 15000);
    mingcuan.addFood("Bihun Goreng", 20000);
    mingcuan.addFood("Kwetiau Goreng", 30000);
    listrestaurant.add(mingcuan);
    
    Restaurant miebondowoso = new Restaurant ("Indonesian", "Pangsit Mie Bondowoso", 7, 13, 22000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)",2);
    miebondowoso.addFood("Pangsit Mie Ayam", 20000);
    miebondowoso.addFood("Pangsit Mie Bakwan", 24000);
    miebondowoso.addFood("Bakwan Sapi", 30000);
    listrestaurant.add(miebondowoso);
    
    Restaurant DepotDjogja = new Restaurant ("Indonesian", "Depot Djogja", 7, 14, 15000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    DepotDjogja.addFood("Nasi Gudeg", 25000);
    DepotDjogja.addFood("Nasi Goreng Kecap", 25000);
    DepotDjogja.addFood("Kwetiau Siram", 30000);
    listrestaurant.add(DepotDjogja);
    
    Restaurant GorenganYummy = new Restaurant ("Indonesian", "Yummy", 7, 14, 15000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    GorenganYummy.addFood("Gorengan bola ayam/pcs", 4000);
    listrestaurant.add(GorenganYummy);
    
    Restaurant BakwanSurabaya = new Restaurant ("Chinese", "Bakwan Surabaya", 7, 14, 15000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    BakwanSurabaya.addFood("Bakwan Halus/pcs", 4000);
    BakwanSurabaya.addFood("Bakwan Kasar/pcs", 4000);
    BakwanSurabaya.addFood("Siomay", 6000);
    listrestaurant.add(BakwanSurabaya);
    
    Restaurant Acuan = new Restaurant ("Chinese", "Acuan", 7, 14, 25000, 40000, 4, "Pasar Citraland (Taman Puspa Raya)", 1);
    Acuan.addFood("Nasi Goreng", 38000);
    Acuan.addFood("Mie Goreng", 38000);
    Acuan.addFood("Kwetiau Goreng", 40000);
    listrestaurant.add(Acuan);
    
    Restaurant Ohana = new Restaurant ("Japanese", "Ohana", 7, 14, 15000, 35000, 4, "Pasar Citraland (Taman Puspa Raya)",2);
    Ohana.addFood("Chicken Katsu (only)", 18000);
    Ohana.addFood("Chicken Karage set", 28000);
    Ohana.addFood("Chicken Teriyaki set", 28000);
    listrestaurant.add(Ohana);
    
    Restaurant Gatherinc = new Restaurant ("Western", "Gatherinc Bistro and Bakery", 7, 14, 40000, 130000, 4, "Taman Puspa Raya A2 no 11",3);
    Gatherinc.addFood("Man and Cheese", 60000);
    Gatherinc.addFood("Under the Sea Salad", 95000);
    Gatherinc.addFood("Taco Bitel", 50000);
    listrestaurant.add( Gatherinc);
    
    Restaurant BuburSurya = new Restaurant ("Indonesian", "Bubur Ayam Surya", 7, 14, 15000, 26000, 4, "Pasar Citraland (Taman Puspa Raya)", 2);
    BuburSurya.addFood("Bubur Ayam Surya", 25000);
    listrestaurant.add(BuburSurya);

    Restaurant Karimun = new Restaurant ("Chinese", "Depot Karimun", 7, 14, 15000, 45000, 4, "Pasar Citraland (Taman Puspa Raya)", 1);
    Karimun.addFood("Misua Komplit", 25000);
    Karimun.addFood("Nasi Babi Kecap", 25000);
    Karimun.addFood("Bai Kut Teh", 30000);
    listrestaurant.add(Karimun);
    
    Restaurant BuMun = new Restaurant ("Indonesian", "Pecel Bu Mun", 6, 15, 10000, 25000, 4, "Pasar Citraland (Taman Puspa Raya)", 3);
    BuMun.addFood("Nasi Pecel", 15000);
    BuMun.addFood("Nasi Campur", 20000);
    BuMun.addFood("Nasi Kuning", 20000);
    listrestaurant.add(BuMun);
    
    Restaurant Katsuku = new Restaurant ("Japanese", "Katsuku", 9, 20, 25000, 30000, 1, "Denver Food, Universitas Ciputra", 2);
    Katsuku.addFood("Teriyaki Chicken Rice", 27000);
    Katsuku.addFood("Curry Chicken Katsu", 27000);
    Katsuku.addFood("Black Pepper Chicken Katsu", 27000);
    listrestaurant.add(Katsuku);
    
    Restaurant UncleHao = new Restaurant ("Indonesian", "Denver Uncle Hao", 9, 20, 25000, 40000, 1, "Denver Food, Universitas Ciputra", 2);
    UncleHao.addFood("Chicken Cabe Garam Rice Bowl", 30000);
    UncleHao.addFood("Tahu Cabe Garam Rice Bowl", 25000);
    UncleHao.addFood("Chicken Sambal Mata Rice Bowl", 30000);
    listrestaurant.add(UncleHao);
    
    Restaurant NasiPriyayi = new Restaurant ("Indonesian", "Denver Nasi Priyayi Dapur Nyonya", 9, 20, 15000, 30000, 1, "Denver Food, Universitas Ciputra", 2);
    NasiPriyayi.addFood("Bakmie UC", 20000);
    NasiPriyayi.addFood("Ayam Geprek", 25000);
    NasiPriyayi.addFood("Telur Geprek", 15000);
    listrestaurant.add(NasiPriyayi);
    
    
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        return listrestaurant;
    }
    
    public void addRestaurant (Restaurant restaurant){
        listrestaurant.add(restaurant);
    }
    
    public void displayrestname(){
        for (int i = 0; i < listrestaurant.size(); i++) {
            System.out.println((i+1) + ". " + listrestaurant.get(i).getName());
        }
    }
}
