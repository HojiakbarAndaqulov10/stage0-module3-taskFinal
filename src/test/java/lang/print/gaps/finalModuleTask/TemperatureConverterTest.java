package lang.print.gaps.finalModuleTask;

import base.BaseIOTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest extends BaseIOTest {

    @Test
    void toFahrenheitConvert1ToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        converter.toFahrenheit(1);

        assertEquals("-17.22222222222222\n", updateLineSpliterators(outContent.toString()));
    }
    @Test
    void toFahrenheitConvert5ToFahrenheit() {
        TemperatureConverter converter = new TemperatureConverter();

        converter.toFahrenheit(5);

        assertEquals("-15.0\n", updateLineSpliterators(outContent.toString()));
    }
}