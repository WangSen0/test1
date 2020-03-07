package netty;

import com.sun.javafx.image.ByteToBytePixelConverter;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.xml.XmlDecoder;
import io.netty.handler.codec.xml.XmlFrameDecoder;

import java.util.List;

/**
 * Created by Administrator on 2020/2/18.
 */
//public class MyByteToMessage  extends SimpleChannelInboundHandler<ByteBuf> {
//    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
//        if(msg.readableBytes() >= 8) {
//            for(int i = 0; i < 8; i++) {
//                msg.setByte(i, msg.getByte(i)- 48);
//            }
//        }
//        ctx.fireChannelRead(msg);
//    }
//}
public class MyByteToMessage  extends XmlDecoder {
    public MyByteToMessage() {
        super();
    }
}
