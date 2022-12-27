package com.annisafira.quiz2_s1si05b_3043;

public class Fakultas_3043 {

    private String idFakultas_3043;
    private String namaFakultas_3043;
    private int pencacah_3043;
    private Prodi_3043 prodi;

    public Fakultas_3043(String id_3043, String nama_3043, int cacah_3043) {
        idFakultas_3043 = id_3043;
        namaFakultas_3043 = nama_3043;
        pencacah_3043 = cacah_3043;
    }

    public void tampilProdi() {
        System.out.println("id prodi ");
        System.out.println("NAma Prodi ");

    }
    
    public void tampilFakultas () {
        System.out.println("id Fakultas  ");
        System.out.println("Nama Fakultas  ");

    }

}
