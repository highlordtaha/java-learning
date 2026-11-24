class Hesap {
    public void bilgiVer() {
        System.out.println("Bu bir banka hesabı");
    }
}

class VadesizHesap extends Hesap {
    @Override
    public void bilgiVer() {
        System.out.println("Vadesiz hesap: istediğin zaman para çekebilirsin");
    }
}

class VadeliHesap extends Hesap{
    @Override
    public void bilgiVer(){
        System.out.println("Vadeli hesap: faiz kazanır");
    }

    public void faizEkle(){
        System.out.println("Faiz eklendi.");
    }
}

public class Main {
    public static void main (String[] args){
        Hesap[] hesaplar = {new VadeliHesap(), new VadesizHesap(), new VadeliHesap()};

        for (int i = 0; i < hesaplar.length; i++){
            hesaplar[i].bilgiVer();

            if (hesaplar[i] instanceof VadeliHesap){
                ((VadeliHesap) hesaplar[i]).faizEkle();
            }
        }
    }
}