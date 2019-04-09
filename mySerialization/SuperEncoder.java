public interface SuperEncoder {

    byte[] serialize(Object anyBeans);
    Object deserialize(byte[] data);

}
