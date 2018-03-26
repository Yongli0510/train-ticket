package travel2.service;

import org.springframework.http.HttpHeaders;
import travel2.domain.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chenjie Xu on 2017/6/7.
 */
public interface Travel2Service {
    String create(Information info);

    Trip retrieve(Information2 info);

    String update(Information info);

    String delete(Information2 info);

    ArrayList<TripResponse> query(QueryInfo info, HttpHeaders headers);

    GetTripAllDetailResult getTripAllDetailInfo(GetTripAllDetailInfo gtdi, HttpHeaders headers);

    GetRouteResult getRouteByTripId(String tripId, HttpHeaders headers);

    GetTrainTypeResult getTrainTypeByTripId(String tripId, HttpHeaders headers);

    List<Trip> queryAll();

    GetTripsByRouteIdResult getTripByRoute(GetTripsByRouteIdInfo info);

    AdminFindAllResult adminQueryAll(HttpHeaders headers);
}
