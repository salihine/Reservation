/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation.ws;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import reservation.models.Flight;

/**
 * REST Web Service
 *
 * @author Ahmad
 */
@Path("Flight")
public class FlightReservation {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of flightReservation
     */
    public FlightReservation() {
    }

    /**
     * Retrieves representation of an instance of reservation.ws.FlightReservation
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getXml() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of FlightReservation
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }

    @GET
    @Path("/load")
    @Produces("application/json")
    public List<Flight> loadFlights() {

        String csvFile = "fligth.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        List<Flight> flightList = new ArrayList<Flight>();
        Flight flight = new Flight();

        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] flightLine = line.split(cvsSplitBy);

                flight.setMonth(Integer.parseInt(flightLine[0]));
                flight.setDayOfMonth(Integer.parseInt(flightLine[1]));
                flight.setDayOfWeek(Integer.parseInt(flightLine[2]));
                flight.setDepTime(Integer.parseInt(flightLine[3]));
                flight.setArrtime(Integer.parseInt(flightLine[4]));
                flight.setFlightNum(Integer.parseInt(flightLine[5]));
                flight.setTailNum(flightLine[6]);
                flight.setOrigin(flightLine[7]);
                flight.setDest(flightLine[8]);
                flight.setDistance(Integer.parseInt(flightLine[9]));

                flightList.add(flight);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        } finally {

            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flightList;
    }


}
