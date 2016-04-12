package test.parkv001;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng lakeLot1 = new LatLng(37.362371, -120.431346);
        //mMap.addMarker(new MarkerOptions().position(lakeLot1).title("Marker in Merced Lake Lot 2"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lakeLot1));
        //mMap.setZoom(16); Did not work
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lakeLot1, 18.0f)); //18 is the optimal number
        //Need to place somewhere else so it will continue to update
        float zoom = mMap.getCameraPosition().zoom;
        // Lets add images
        //Start of Lake Lot 2
        //Singular left vertical strip

        LatLngBounds llot1 = new LatLngBounds(
                new LatLng(37.361872, -120.431783),       // South west corner
                new LatLng(37.363082, -120.431724));      // North east corner
        GroundOverlayOptions lgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_leftgrid))
                .positionFromBounds(llot1);
        //Four right parking sections    *** Keep note of that dirt section
        LatLngBounds rlot1 = new LatLngBounds(
                new LatLng(37.363010, -120.430845),       // South west corner
                new LatLng(37.363090, -120.430787));      // North east corner
        GroundOverlayOptions rgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_top_rightgrid))
                .positionFromBounds(rlot1);

        LatLngBounds rlot2 = new LatLngBounds(
                new LatLng(37.362634, -120.430844),       // South west corner
                new LatLng(37.362951, -120.430786));      // North east corner
        GroundOverlayOptions rgrid2 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_top_rightgrid2))
                .positionFromBounds(rlot2);

        LatLngBounds rlot3 = new LatLngBounds(
                new LatLng(37.362135, -120.430845),       // South west corner
                new LatLng(37.362337, -120.430790));      // North east corner
        GroundOverlayOptions rgrid3 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_top_rightgrid3))
                .positionFromBounds(rlot3);

        LatLngBounds rlot4 = new LatLngBounds(
                new LatLng(37.361854, -120.430845),       // South west corner
                new LatLng(37.361981, -120.430789));      // North east corner
        GroundOverlayOptions rgrid4 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_top_rightgrid4))
                .positionFromBounds(rlot4);
//        Middle, top, and bottom section
        LatLngBounds tlot1 = new LatLngBounds(
                new LatLng(37.363105, -120.431680),       // South west corner
                new LatLng(37.363152, -120.430883));      // North east corner
        GroundOverlayOptions tgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_topgrid))
                .positionFromBounds(tlot1);

        LatLngBounds mlot1 = new LatLngBounds(
                new LatLng(37.362942, -120.431640),       // South west corner
                new LatLng(37.363033, -120.430936));      // North east corner
        GroundOverlayOptions grid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot1);
        LatLngBounds mlot2 = new LatLngBounds(
                new LatLng(37.362771, -120.431640),       // South west corner
                new LatLng(37.362863, -120.430929));      // North east corner
        GroundOverlayOptions grid2 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot2);
        LatLngBounds mlot3 = new LatLngBounds(
                new LatLng(37.362601, -120.431640),       // South west corner
                new LatLng(37.362693, -120.430936));      // North east corner
        GroundOverlayOptions grid3 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot3);
        LatLngBounds mlot4 = new LatLngBounds(
                new LatLng(37.362430, -120.431640),       // South west corner
                new LatLng(37.362525, -120.430936));      // North east corner
        GroundOverlayOptions grid4 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot4);
        LatLngBounds mlot5 = new LatLngBounds(
                new LatLng(37.362261, -120.431640),       // South west corner
                new LatLng(37.362354, -120.430936));      // North east corner
        GroundOverlayOptions grid5 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot5);
        LatLngBounds mlot6 = new LatLngBounds(
                new LatLng(37.362095, -120.431641),       // South west corner
                new LatLng(37.362180, -120.430936));      // North east corner
        GroundOverlayOptions grid6 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot6);
        LatLngBounds mlot7 = new LatLngBounds(
                new LatLng(37.361928, -120.431633),       // South west corner
                new LatLng(37.362010, -120.430941));      // North east corner
        GroundOverlayOptions grid7 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_middlegrid))
                .positionFromBounds(mlot7);
        LatLngBounds blot8 = new LatLngBounds(
                new LatLng(37.361806, -120.431641),       // South west corner
                new LatLng(37.361849, -120.430931));      // North east corner
        GroundOverlayOptions grid8 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_1_botgrid))
                .positionFromBounds(blot8);

//        End of Lake Lot 1

//        Start of Lake Lot 2
        LatLngBounds lakelot1top = new LatLngBounds(
                new LatLng(37.363144, -120.430420),       // South west corner
                new LatLng(37.363187, -120.429380));      // North east corner
        GroundOverlayOptions l2grid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2topgrid))
                .positionFromBounds(lakelot1top);

        LatLngBounds lakelot1mid1 = new LatLngBounds(
                new LatLng(37.362970, -120.430319),       // South west corner
                new LatLng(37.363071, -120.429559));      // North east corner
        GroundOverlayOptions l2grid2 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2midgrid))
                .positionFromBounds(lakelot1mid1);
        LatLngBounds lakelot1mid2 = new LatLngBounds(
                new LatLng(37.362796, -120.430321),       // South west corner
                new LatLng(37.362893, -120.429469));      // North east corner
        GroundOverlayOptions l2grid3 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2mid2grid))
                .positionFromBounds(lakelot1mid2);
        LatLngBounds lakelot1mid3 = new LatLngBounds(
                new LatLng(37.362619, -120.430320),       // South west corner
                new LatLng(37.362717, -120.429470));      // North east corner
        GroundOverlayOptions l2grid4 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2mid2grid))
                .positionFromBounds(lakelot1mid3);
        LatLngBounds lakelot1mid4 = new LatLngBounds(
                new LatLng(37.362444, -120.430321),       // South west corner
                new LatLng(37.362540, -120.429470));      // North east corner
        GroundOverlayOptions l2grid5 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2mid2grid))
                .positionFromBounds(lakelot1mid4);
        LatLngBounds lakelot1mid5 = new LatLngBounds(
                new LatLng(37.362268, -120.430321),       // South west corner
                new LatLng(37.362365, -120.429470));      // North east corner
        GroundOverlayOptions l2grid6 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2mid2grid))
                .positionFromBounds(lakelot1mid5);
        //bottom section
        LatLngBounds lakelot1bot1 = new LatLngBounds(
                new LatLng(37.362149, -120.430420),       // South west corner
                new LatLng(37.362191, -120.429397));      // North east corner
        GroundOverlayOptions l2bgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2botgrid))
                .positionFromBounds(lakelot1bot1);
        // left section
        LatLngBounds lakelot1left1 = new LatLngBounds(
                new LatLng(37.363002, -120.430504),       // South west corner
                new LatLng(37.363141, -120.430441));      // North east corner
        GroundOverlayOptions l2lgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2leftgrid))
                .positionFromBounds(lakelot1left1);
        LatLngBounds lakelot1left2 = new LatLngBounds(
                new LatLng(37.362482, -120.430504),       // South west corner
                new LatLng(37.362855, -120.430445));      // North east corner
        GroundOverlayOptions l2lgrid2 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2leftgrid2))
                .positionFromBounds(lakelot1left2);
        LatLngBounds lakelot1left3 = new LatLngBounds(
                new LatLng(37.362193, -120.430504),       // South west corner
                new LatLng(37.362332, -120.430445));      // North east corner
        GroundOverlayOptions l2lgrid3 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2leftgrid3))
                .positionFromBounds(lakelot1left3);
        //Right section
        LatLngBounds lakelot1right1 = new LatLngBounds(
                new LatLng(37.362209, -120.429349),       // South west corner
                new LatLng(37.362885, -120.429293));      // North east corner
        GroundOverlayOptions l2rgrid1 = new GroundOverlayOptions()
                .image(BitmapDescriptorFactory.fromResource(R.drawable.lake_lot_2_rightgrid))
                .positionFromBounds(lakelot1right1);

//        Lake Lot 2 Section
/*
        mMap.addGroundOverlay(l2grid1);
        mMap.addGroundOverlay(l2grid2);
        mMap.addGroundOverlay(l2grid3);
        mMap.addGroundOverlay(l2grid4);
        mMap.addGroundOverlay(l2grid5);
        mMap.addGroundOverlay(l2grid6);
        mMap.addGroundOverlay(l2bgrid1);
        mMap.addGroundOverlay(l2lgrid1);
        mMap.addGroundOverlay(l2lgrid2);
        mMap.addGroundOverlay(l2lgrid3);
        mMap.addGroundOverlay(l2rgrid1);
*/



//        Lake Lot 1 Section
//        End of Middle and bottom Section
        //Top Grid
        mMap.addGroundOverlay(tgrid1);
        //Left Grid
        mMap.addGroundOverlay(lgrid1);
        //Right Grids
        mMap.addGroundOverlay(rgrid1);
        mMap.addGroundOverlay(rgrid2);
        mMap.addGroundOverlay(rgrid3);
        mMap.addGroundOverlay(rgrid4);
        //All middle grids
        mMap.addGroundOverlay(grid1);
        mMap.addGroundOverlay(grid2);
        mMap.addGroundOverlay(grid3);
        mMap.addGroundOverlay(grid4);
        mMap.addGroundOverlay(grid5);
        mMap.addGroundOverlay(grid6);
        mMap.addGroundOverlay(grid7);
        mMap.addGroundOverlay(grid8);
//        End of Lake Lot 2 Section
        //Lets not
    }
}
