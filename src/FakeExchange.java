public class FakeExchange implements Exchange {

  private final static float USD_TO_EURO_RATE = 0.95f;

  public FakeExchange() {
  }

  @Override
  public float rate(String origin, String target) {
      return USD_TO_EURO_RATE;
  }

}