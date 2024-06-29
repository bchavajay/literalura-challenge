package gt.bchavajay.literalurachallenge.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
