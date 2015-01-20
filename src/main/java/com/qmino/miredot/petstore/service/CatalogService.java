package com.qmino.miredot.petstore.service;

import com.qmino.miredot.annotations.BodyType;
import com.qmino.miredot.annotations.ReturnType;
import com.qmino.miredot.petstore.domain.Category;
import com.qmino.miredot.petstore.domain.Item;
import com.qmino.miredot.petstore.domain.Product;
import com.qmino.miredot.petstore.exceptions.AuthorizationException;
import org.jboss.resteasy.annotations.GZIP;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * <p/>
 * <p>
 * <i>Creation-Date</i>: 13/05/13<br>
 * <i>Creation-Time</i>:  13:02<br>
 * </p>
 *
 * @author Jeroen
 * @author <a href="http://www.qmino.com">Qmino bvba</a>
 */
@Path("/catalog")
public interface CatalogService {

    /**
     * Get all categories. See also {@link #findCategory(Long)}
     *
     * @return All categories
     * @summary Get all categories
     */
    @GET
    @GZIP
    @Path("/category")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Category> findAllCategories();

    /**
     * Get the category with the specified category id.
     *
     * @param categoryId The category id
     * @return The category with the specified id
     * @summary Get the category with the specified id
     */
    @GET
    @Path("/category/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Category findCategory(@PathParam("id") Long categoryId);

    /**
     * Create a new category. Fails if the category name is taken.
     *
     * @param category The category that will be created
     * @summary Create a new category
     */
    @POST
    @Path("/category")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createCategory(Category category);

    /**
     * Update category name and description. Cannot be used to edit products in this category.
     *
     * @param categoryId The id of the category that will be updated
     * @param category   The category details
     * @summary Update category name and description
     */
    @PUT
    @Path("/category/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateCategory(@PathParam("id") Long categoryId, Category category);

    /**
     * Deletes category with given id. Only categories that apply to no products can be deleted.
     *
     * @param categoryId The id of the category to be deleted
     * @throws AuthorizationException The user is not authorized to delete this category.
     */
    @DELETE
    @Path("/category/{id}")
    public void removeCategory(@PathParam("id") Long categoryId) throws AuthorizationException;

    /**
     * Get all products
     *
     * @param minPrice The minimal price for a product to be included in the result.
     * @return All products
     * @summary Get all products
     */
    @GET
    @Path("/product")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Product> findAllProducts(@QueryParam("minPrice") @DefaultValue("0") Double minPrice);

    /**
     * Get the product with the specified id
     *
     * @param productId The product id
     * @return The product with the specified id
     * @summary Get the product with the specified id
     */
    @GET
    @Path("/product/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Product findProduct(@PathParam("id") Long productId);

    /**
     * Create a new product.
     *
     * @param product The product that will be created
     * @summary Create a new product
     */
    @POST
    @Path("/product")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createProduct(Product product);

    /**
     * Update product name and description.
     *
     * @param productId The id of the product that will be updated
     * @param product   The product details
     * @summary Update product name and description
     */
    @PUT
    @Path("/product/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateProduct(@PathParam("id") Long productId, Product product);

    /**
     * Deletes product with given id.
     *
     * @param productId The id of the product to be deleted
     * @summary Delete product with given id
     */
    @DELETE
    @Path("/product/{id}")
    public void removeProduct(@PathParam("id") Long productId);

    /**
     * Get all items
     *
     * @return All items
     * @summary Get all items
     */
    @GET
    @Path("/item")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Item> findAllItems();

    /**
     * Get the item with the specified id
     *
     * @param itemId The item id
     * @return The item with the specified id
     * @summary Get the item with the specified id
     */
    @GET
    @Path("/item/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Item findItem(@PathParam("id") Long itemId);

    /**
     * Create a new item.
     *
     * @param item The item that will be created
     * @summary Create a new item
     */
    @POST
    @Path("/item")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createItem(Item item);

    /**
     * Update item name and description.
     *
     * @param itemId The id of the item that will be updated
     * @param item   The item details
     * @summary Update item details
     */
    @PUT
    @Path("/item/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateItem(@PathParam("id") Long itemId, Item item);

    /**
     * Deletes item with given id.
     *
     * @param itemId The id of the item to be deleted
     * @summary Delete item with given id
     */
    @DELETE
    @Path("/item/{id}")
    public void removeItem(@PathParam("id") Long itemId);

    /**
     * Illustrating the usage of {@code @ReturnType}
     *
     * @param itemId The id of the item to get some response from
     * @return A list of MyResponse encapsulated in a javax.ws.rs.core.Response object
     * @summary @ReturnType usage
     */
    @GET
    @Path("/item/response/{id}")
    @ReturnType("java.util.List<com.qmino.miredot.petstore.domain.MyResponse>")
    public Response getResponse(@PathParam("id") Long itemId);

    /**
     * Illustrating the usage of {@code @ReturnType} (void) and {@code @BodyType}.
     *
     * @param myJson The address.
     * @return A list of MyResponse encapsulated in a javax.ws.rs.core.Response object
     * @summary @ReturnType(void) and @BodyType usage.
     * @statuscode 201 The item has been created.
     */
    @POST
    @Path("/item/response/")
    @ReturnType("java.lang.Void") // We won't return anything but need the response object to set the http status code.
    @BodyType("com.qmino.miredot.petstore.domain.Address") // We'll parse the json manually
    public Response putSomething(String myJson);
}
