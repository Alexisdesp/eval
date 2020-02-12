package valarep;

public class Chambre {
        private  int idChambre;
        private  int etag;
        private boolean empty;
        public Chambre()
        {
            this.idChambre = 0;
            this.etag = 0;
            this.empty = false;
        }
        public Chambre(int idChambre, int etag, boolean empty) {
            this.idChambre = idChambre;
            this.etag = etag;
            this.empty = empty;
        }
        public int getEtag() {
            return etag;
        }
        public void setEtag(int etag) {
            this.etag = etag;
        }
        public boolean isEmpty() {
            return empty;
        }
        public void setEmpty(boolean empty) {
            this.empty = empty;
        }
        public int getIdChambre() {
            return idChambre;
        }
        public void setIdChambre(int idChambre) {
            this.idChambre = idChambre;
        }
    
    }
    