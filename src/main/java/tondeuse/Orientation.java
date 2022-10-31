package tondeuse;
public enum Orientation{



    N {
        @Override
        public Orientation droite() {
            return E;
        }
        @Override
        public Orientation gauche() {
            return W;
        }
    },

    E {
        @Override
        public Orientation droite() {
            return S;
        }
        @Override
        public Orientation gauche() {
            return N;
        }
    },

    W {
        @Override
        public Orientation droite() {
            return N;
        }
        @Override
        public Orientation gauche() {
            return S;
        }
    },

    S {
        @Override
        public Orientation droite() {
            return W;
        }
        @Override
        public Orientation gauche() {
            return E;
        }
    };

    public abstract Orientation droite();

    public abstract Orientation gauche();
    
    
    
}
