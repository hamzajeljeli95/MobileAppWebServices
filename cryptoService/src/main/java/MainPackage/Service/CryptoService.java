package MainPackage.Service;

import MainPackage.Util.AdvancedEncryptionStandard;
import org.springframework.stereotype.Service;

@Service
public class CryptoService {
    /**
     * TO DO : Pickup an APP key
     */
    private static String Key = "";

    public String getKey(String DeviceFingerPrint) throws Exception{
        return new AdvancedEncryptionStandard(DeviceFingerPrint.getBytes()).encrypt(Key.getBytes()).toString();
    }
}
