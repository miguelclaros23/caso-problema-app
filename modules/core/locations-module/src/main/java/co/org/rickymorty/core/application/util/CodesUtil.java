/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.org.rickymorty.core.application.util;

import co.org.rickymorty.core.application.exception.EncryptException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author JuliĂˇn Misnaza
 */
public final class CodesUtil {

  /**
   * Logger para la clase.
   */
  private static final Logger LOG = LoggerFactory.getLogger(CodesUtil.class);

  public static String calculateCode() {
    LOG.debug("Method : [calculateCode]");
    StringBuilder builder = new StringBuilder();
    long milis = new java.util.GregorianCalendar().getTimeInMillis();
    Random r = new Random(milis);
    int i = 0;
    while (i < 7) {
      char c = (char) r.nextInt(255);
      if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z')) {
        builder.append(c);
        i++;
      }
    }
    return builder.toString();
  }

  public static String generatePhoneToken() {
    LOG.debug("Method : generatePhoneToken()");
    return RandomStringUtils.randomNumeric(4);
  }

  public static String generateTemporaryPassword() {
    LOG.debug("Method : generateTemporaryPassword()");
    return RandomStringUtils.randomAlphanumeric(8);
  }

  /**
   *
   * @param message
   * @return
   * @throws co.com.ricky-morty.exception.EncryptException
   */
  public static String encryptMD5(String message) throws EncryptException {
    try {
      byte[] messageBytes = message.getBytes("UTF-8");
      MessageDigest digest = MessageDigest.getInstance("MD5");
      byte[] data = digest.digest(messageBytes);
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < data.length; i++) {
        sb.append(Integer.toString((data[i] & 0xff) + 0x100, 16).substring(1));
      }
      LOG.debug("Digest(in hex format):: " + sb.toString());
      return sb.toString();
    } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
      throw new EncryptException(ex.getMessage(), ex);
    }
  }
}
