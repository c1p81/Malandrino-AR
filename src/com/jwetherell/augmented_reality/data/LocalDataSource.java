package com.jwetherell.augmented_reality.data;

import java.util.ArrayList;
import java.util.List;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

import com.malandrino.R;
import com.jwetherell.augmented_reality.ui.IconMarker;
import com.jwetherell.augmented_reality.ui.Marker;


/**
 * This class should be used as a example local data source. It is an example 
 * of how to add data programatically. You can add data either programatically, 
 * SQLite or through any other source.
 * 
 * @author Justin Wetherell <phishman3579@gmail.com>
 */
public class LocalDataSource extends DataSource{
    private List<Marker> cachedMarkers = new ArrayList<Marker>();
    private static Bitmap icon = null;
    
    public LocalDataSource(Resources res) {
        if (res==null) throw new NullPointerException();
        
        createIcon(res);
    }
    
    protected void createIcon(Resources res) {
        if (res==null) throw new NullPointerException();
        
        icon=BitmapFactory.decodeResource(res, R.drawable.mirino);
    }
    
    public List<Marker> getMarkers() {
    	//************* dati personalizzati
    	Double[] ar_lat = new Double[40];
    	Double[] ar_lon = new Double[40];
    	int[] ar_quo = new int[40];
    	String[] ar_testo = new String[40];
    	
    	ar_lat[0] = 43.90931;
    	ar_lon[0] = 11.08844;
    	ar_quo[0] = 78;
    	ar_testo[0] = "Galceti";

    	ar_lat[1] = 43.92732;
    	ar_lon[1] = 11.11857;
    	ar_quo[1] = 529;
    	ar_testo[1] = "P.Malaparte";

    	ar_lat[2] = 43.92029;
    	ar_lon[2] = 11.10104;
    	ar_quo[2] = 445;
    	ar_testo[2] = "C.Schignano(R)";

    	ar_lat[3] = 43.92029;
    	ar_lon[3] = 11.07658;
    	ar_quo[3] = 420;
    	ar_testo[3] = "M.Ferrato";

    	ar_lat[4] = 43.96655;
    	ar_lon[4] = 11.08583;
    	ar_quo[4] = 931;
    	ar_testo[4] = "Javello";

    	ar_lat[5] = 43.97548;
    	ar_lon[5] = 11.07809;
    	ar_quo[5] = 976;
    	ar_testo[5] = "Cavallaie";

    	ar_lat[6] = 43.98755;
    	ar_lon[6] = 11.05796;
    	ar_quo[6] = 860;
    	ar_testo[6] = "P.Acandoli";

    	ar_lat[7] = 44.00467;
    	ar_lon[7] = 11.03441;
    	ar_quo[7] = 1181;
    	ar_testo[7] = "Straccalasino";

    	ar_lat[8] = 43.99821;
    	ar_lon[8] = 11.01914;
    	ar_quo[8] = 881;
    	ar_testo[8] = "C.di Spedaletto(R)";

    	ar_lat[9] = 44.02959;
    	ar_lon[9] = 10.93080;
    	ar_quo[9] = 932;
    	ar_testo[9] = "C.Vecchia Pistoia(R)";

    	ar_lat[10] = 44.05661;
    	ar_lon[10] = 10.90816;
    	ar_quo[10] = 603;
    	ar_testo[10] = "Pracchia(R)";

    	ar_lat[11] = 44.08632;
    	ar_lon[11] = 10.85065;
    	ar_quo[11] = 1567;
    	ar_testo[11] = "R.Montanaro(R)";

    	
    	ar_lat[12] = 44.08937;
    	ar_lon[12] = 10.84863;
    	ar_quo[12] = 1662;
    	ar_testo[12] = "P.Malandrini";

    	ar_lat[13] = 44.10152;
    	ar_lon[13] = 10.84882;
    	ar_quo[13] = 1675;
    	ar_testo[13] = "F.Uccelliera";

    	ar_lat[14] = 44.10994;
    	ar_lon[14] = 10.83814;
    	ar_quo[14] = 1634;
    	ar_testo[14] = "Passo Cancellino";

    	ar_lat[15] = 44.11582;
    	ar_lon[15] = 10.82887;
    	ar_quo[15] = 1847;
    	ar_testo[15] = "Passo Strofinatoio";

    	ar_lat[16] = 44.11868;
    	ar_lon[16] = 10.80713;
    	ar_quo[16] = 1775;
    	ar_testo[16] = "L.Scaffaiolo";

    	ar_lat[17] = 44.12790;
    	ar_lon[17] = 10.79543;
    	ar_quo[17] = 1827;
    	ar_testo[17] = "M.Spigolino";

    	ar_lat[18] = 44.13002;
    	ar_lon[18] = 10.78322;
    	ar_quo[18] = 1652;
    	ar_testo[18] = "Passo Croce Arcana(R)";

    	ar_lat[19] = 44.15121;
    	ar_lon[19] = 10.75937;
    	ar_quo[19] = 1631;
    	ar_testo[19] = "C.Acqua Marcia";

    	ar_lat[20] = 44.15632;
    	ar_lon[20] = 10.74499;
    	ar_quo[20] = 1799;
    	ar_testo[20] = "Cima Tauffi";

    	ar_lat[21] = 44.15636;
    	ar_lon[21] = 10.73551;
    	ar_quo[21] = 1702;
    	ar_testo[21] = "M.Lancino";
    	
    	ar_lat[22] = 44.15577;
    	ar_lon[22] = 10.72029;
    	ar_quo[22] = 1776;
    	ar_testo[22] = "Cervinara";

    	ar_lat[23] = 44.15737;
    	ar_lon[23] = 10.71231;
    	ar_quo[23] = 1937;
    	ar_testo[23] = "Libro Aperto";

    	ar_lat[24] = 44.15745;
    	ar_lon[24] = 10.69069;
    	ar_quo[24] = 1492;
    	ar_testo[24] = "Casetta Lapo(R)";

    	ar_lat[25] = 44.15693;
    	ar_lon[25] = 10.67998;
    	ar_quo[25] = 1562;
    	ar_testo[25] = "M.Maiore";

    	ar_lat[26] = 44.11556;
    	ar_lon[26] = 10.63747;
    	ar_quo[26] = 1724;
    	ar_testo[26] = "Lago Nero";

    	ar_lat[27] = 44.11869;
    	ar_lon[27] = 10.63080;
    	ar_quo[27] = 1824;
    	ar_testo[27] = "Lago Piatto";

    	ar_lat[28] = 44.12759;
    	ar_lon[28] = 10.64423;
    	ar_quo[28] = 18080;
    	ar_testo[28] = "M:Gomito";

    	ar_lat[29] = 44.13092;
    	ar_lon[29] = 10.66055;
    	ar_quo[29] = 1700;
    	ar_testo[29] = "Rifugio Selletta";

    	ar_lat[30] = 44.14542;
    	ar_lon[30] = 10.66526;
    	ar_quo[30] = 1388;
    	ar_testo[30] = "Abetone";

    	ar_lat[31] = 44.11534;
    	ar_lon[31] = 10.59323;
    	ar_quo[31] = 1963;
    	ar_testo[31] = "M.Rondinaio";
    	
    	ar_lat[32] = 44.13197;
    	ar_lon[32] = 10.57625;
    	ar_quo[32] = 1990;
    	ar_testo[32] = "M.Giovo";

    	ar_lat[33] = 44.14542;
    	ar_lon[33] = 10.66526;
    	ar_quo[33] = 1388;
    	ar_testo[33] = "Abetone";

    	ar_lat[34] = 44.19371;
    	ar_lon[34] = 10.69862;
    	ar_quo[34] = 2165;
    	ar_testo[34] = "M.Cimone";

    	ar_lat[35] = 44.15103;
    	ar_lon[35] = 10.77490;
    	ar_quo[35] = 1316;
    	ar_testo[35] = "Capanno Tassoni";

    	ar_lat[36] = 44.11953;
    	ar_lon[36] = 10.83014;
    	ar_quo[36] = 1945;
    	ar_testo[36] = "Corno alle Scale";

    	ar_lat[37] = 44.10258;
    	ar_lon[37] = 10.84602;
    	ar_quo[37] = 1814;
    	ar_testo[37] = "M.Gennaio";

    	ar_lat[38] = 44.10258;
    	ar_lon[38] = 10.84602;
    	ar_quo[38] = 768;
    	ar_testo[38] = "La Retaia";

    	
    	//deve essere aggiornato anche il massimo del ciclo for
    	for (int i=0; i<39; i++) {
            Marker m = new IconMarker(ar_testo[i], ar_lat[i], ar_lon[i], ar_quo[i], Color.RED,icon);
            cachedMarkers.add(m);
        }
        /*
        Marker lon = new IconMarker("I am a really really long string which should wrap a number of times on the screen.", 
                                 39.95335, -74.9223445, 
                                 0, 
                                 Color.MAGENTA,
                                 icon);
        cachedMarkers.add(lon);
        Marker lon2 = new IconMarker("2: I am a really really long string which should wrap a number of times on the screen.", 
                39.95334, -74.9223446, 
                0, 
                Color.MAGENTA,
                icon);
        cachedMarkers.add(lon2);
        */
        
        /*
        for (int i=0; i<10; i++) {
            Marker marker = null;
            if (i%2==0) marker = new Marker("Test-"+i, 39.99, -75.33, 0, Color.LTGRAY);
            marker = new IconMarker("Test-"+i, 39.99, -75.33, 0, Color.LTGRAY, icon);
            cachedMarkers.add(marker);
        }
        */
        
        return cachedMarkers;
    }
}
