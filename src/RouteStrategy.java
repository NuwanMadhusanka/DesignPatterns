
public interface RouteStrategy {

	void buidRoute(String from, String to);
}

class RoadStrategy implements RouteStrategy {

	@Override
	public void buidRoute(String from, String to) {
		System.out.println("For navigate from " + from + " to " + to + " use Road");
	}

}

class WalkingStrategy implements RouteStrategy {

	@Override
	public void buidRoute(String from, String to) {
		System.out.println("For navigate from " + from + " to " + to + " use Walking");

	}

}

class PublicTransportStrategy implements RouteStrategy{

	@Override
	public void buidRoute(String from, String to) {
		System.out.println("For navigate from " + from + " to " + to + " use Public Transport");
		
	}
	
}
