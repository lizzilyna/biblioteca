package org.example.entities;
import jakarta.persistence.*;



    @Entity
    @Inheritance(strategy =InheritanceType.TABLE_PER_CLASS )
    abstract class Catalogo {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int isdn;
        @OneToOne(mappedBy = "catalogo")
        private Prestito prestito;
        private String titolo;

        private  int anno;
        private int pagine;

        public Catalogo(){}

        public Catalogo(String titolo, int anno, int pagine) {
            this.titolo = titolo;
            this.anno = anno;
            this.pagine = pagine;
        }

        public int getIsdn() {
            return isdn;
        }

        public void setCodiceISBN(int isdn) {
            this.isdn = isdn;
        }

        public String getTitolo() {
            return titolo;
        }

        public void setTitolo(String titolo) {
            this.titolo = titolo;
        }

        public int getAnno() {
            return anno;
        }

        public void setAnno(int anno) {
            this.anno = anno;
        }

        public int getPagine() {
            return pagine;
        }

        public void pagine(int pagine) {
            this.pagine = pagine;
        }

        @Override
        public String toString() {
            return "Catalogo{" +
                    "isdn=" + isdn +
                    ", prestito=" + prestito +
                    ", titolo='" + titolo + '\'' +
                    ", anno=" + anno +
                    ", pagine=" + pagine +
                    '}';
        }
    }


