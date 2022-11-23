public enum TemperatureConvert {
    C_F('c', 'f', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn * 1.8f + 32;
        }
    }),
    C_K('c', 'k', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273f;
        }
    }),
    K_C('k', 'c', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273f;
        }
    }),
    F_C('f', 'c', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) / 1.8f;
        }
    }),
    F_K('f', 'k', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) / 1.8f + 273;
        }
    }),
    K_F('k', 'f', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273) * 1.8f + 32;
        }
    });
    private char input;
    private char output;
    private Converter converter;

    public static float convertTemperature(char input, char
            output, float temp) {
        for (TemperatureConvert temperatureConverter : values())
        {
            if (temperatureConverter.input == input &&
                    temperatureConverter.output == output) {
                return
                        temperatureConverter.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }


    TemperatureConvert(char input, char output, Converter converter) {
        this.input = input;
        this.output = output;
        this.converter = converter;
    }


}
