public class App {

    public static void main(String[] args) {
        System.out.println("*****************KEIRA KAYLA AQILA****************************");
        System.out.println("*******************225150607111021****************************");
        

        Character ch = new Character();
        ch.move();
        // "Polimorfisme dinamis diterapkan pada referensi objek dari kelas Character."
       
        Hero he = new Hero();
        he.move();
        he.move("north\n");
        // "Polimorfisme statis diterapkan pada kelas Hero."

        Enemy en = new Enemy();
        en.move();
        en.move(9);
        System.out.println("");
        // "Polimorfisme statis diterapkan pada kelas Enemy."
        
        ch = new Hero();
        ch.move();
        // "Polimorfisme dinamis terjadi ketika objek Character merujuk pada objek Hero,
        // dan memanggil metode move() pada objek Hero."
        
        ch = new Enemy();
        ch.move();
        //"Polimorfisme dinamis terjadi ketika objek Character merujuk pada objek Enemy,
        //dan memanggil metode move() pada objek Enemy."
       
        ch = new Witch();
        ch.move();
        //"Polimorfisme dinamis terjadi ketika objek Character merujuk pada objek Witch, 
        //dan memanggil metode move() pada objek Witch."
    
        ch = new Fighter();
        ch.move(); 
        System.out.println("");
        //"Polimorfisme dinamis terjadi ketika objek Character merujuk pada objek Fighter, 
        //dan memanggil metode move() pada objek Fighter."

        System.out.println("Terjadi kesalahan karena kelas Fighter dan kelas Witch berada pada kelas induk (parent class) yang berbeda.");
        
        Character character = new Witch();
        character.move();

        Character fighter = (Fighter) character;
        fighter.move();

    }
}