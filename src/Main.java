
public class Main {

	public static void main(String[] args) {

		String from = "Homagama";
		String to = "Kottawa";

		Navigator navigation = new Navigator();
		
		navigation.buildRouteStrategy(new PublicTransportStrategy());
		navigation.routeStrategy.buidRoute(from, to);
		
		navigation.buildRouteStrategy(new RoadStrategy());
		navigation.routeStrategy.buidRoute(from, to);
		
		navigation.buildRouteStrategy(new WalkingStrategy());
		navigation.routeStrategy.buidRoute(from, to);
	}
}
