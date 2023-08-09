

        class Pair<F, S> {
            private F first;
            private S second;

            Pair(F first, S second) {
                this.first = first;
                this.second = second;
            }

            static<F, S> Pair<F, S> of(F first, S second) {
                return new Pair<F, S>(first,second);
            }

            @Override
            public String toString() {
                return "Pair{" + first + " " + second + "}";
            }
        }

