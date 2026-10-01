package com.workflow_def.service.util;

import java.util.Base64;

public class DecodeXMLUtil {
    static Base64.Decoder decoder = Base64.getDecoder();
    static byte[] decodeXML(String encodedXML) {
        return decoder.decode(encodedXML);
    }

}
