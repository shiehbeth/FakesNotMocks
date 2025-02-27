public class FakeExchange implements Exchange {

  private final static float usdToEuroRate = 0.95f;

  public FakeExchange() {
  }

  @Override
  public float rate(String origin, String target) {
      return usdToEuroRate;
  }

}