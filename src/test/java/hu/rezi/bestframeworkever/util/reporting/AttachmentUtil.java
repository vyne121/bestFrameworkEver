package hu.rezi.bestframeworkever.util;

import io.qameta.allure.Attachment;

import java.io.File;

public class AttachmentUtil {

  private AttachmentUtil() {}

  public static void attachScreenshot(String name) {

  }

  /*@Attachment(value = "Screenshot", type = "image/png")
  public static byte[] getScreenShot(TakesScreenshot driver, Path screenshot) {
      try (OutputStream screenshotStream = Files.newOutputStream(screenshot)) {
          byte[] bytes = driver.getScreenshotAs(OutputType.BYTES);
          screenshotStream.write(bytes);
          screenshotStream.close();
          return bytes;
      } catch (IOException e) {
          logger.error("Unable to write " + screenshot, e);
      } catch (WebDriverException e) {
          logger.error("Unable to take screenshot.", e);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
      return null;
  }*/
}
