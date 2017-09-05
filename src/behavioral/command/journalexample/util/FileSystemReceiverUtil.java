package behavioral.command.journalexample.util;

import behavioral.command.journalexample.receiver.FileSystemReceiver;
import behavioral.command.journalexample.receiver.UnixFileSystemReceiver;
import behavioral.command.journalexample.receiver.WindowsFileSystemReceiver;

public class FileSystemReceiverUtil {
    public static FileSystemReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else{
            return new UnixFileSystemReceiver();
        }
    }
}
