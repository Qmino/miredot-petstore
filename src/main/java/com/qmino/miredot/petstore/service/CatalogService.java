package com.qmino.miredot.petstore.service;

import com.qmino.miredot.petstore.domain.Category;
import com.qmino.miredot.petstore.domain.Item;
import com.qmino.miredot.petstore.domain.Product;
import com.qmino.miredot.petstore.exceptions.AuthorizationException;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
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
     * Get all categories
     * @summary Get all categories
     * @return All categories
     */
    @GET
    @Path("/category")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Category> findAllCategories();

    /**
     * Get the category with the specified id
     * @summary Get the category with the specified id
     * @param categoryId The category id
     * @return The category with the specified id
     */
    @GET
    @Path("/category/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Category findCategory(@PathParam("id") Long categoryId);

    /**
     * Create a new category. Fails if the category name is taken.
     * @summary Create a new category
     * @param category The category that will be created
     */
    @POST
    @Path("/category")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createCategory(Category category);

    /**
     * Update category name and description. Cannot be used to edit products in this category.
     * @summary Update category name and description
     * @param categoryId The id of the category that will be updated
     * @param category The category details
     */
    @PUT
    @Path("/category/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateCategory(@PathParam("id") Long categoryId, Category category);

    /**
     * Deletes category with given id. Only categories that apply to no products can be deleted.
     * @summary Delete category with given id
     * @param categoryId The id of the category to be deleted
     * @throws AuthorizationException The user is not authorized to delete this category.
     */
    @DELETE
    @Path("/category/{id}")
    public void removeCategory(@PathParam("id") Long categoryId) throws AuthorizationException;

    /**
     * Get all products
     * @summary Get all products
     * @return All products
     */
    @GET
    @Path("/product")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Product> findAllProducts();

    /**
     * Get the product with the specified id
     * @summary Get the product with the specified id
     * @param productId The product id
     * @return The product with the specified id
     */
    @GET
    @Path("/product/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Product findProduct(@PathParam("id") Long productId);

    /**
     * Create a new product.
     * @summary Create a new product
     * @param product The product that will be created
     */
    @POST
    @Path("/product")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createProduct(Product product);

    /**
     * Update product name and description.
     * @summary Update product name and description
     * @param productId The id of the product that will be updated
     * @param product The product details
     */
    @PUT
    @Path("/product/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateProduct(@PathParam("id") Long productId, Product product);

    /**
     * Deletes product with given id.
     * @summary Delete product with given id
     * @param productId The id of the product to be deleted
     */
    @DELETE
    @Path("/product/{id}")
    public void removeProduct(@PathParam("id") Long productId);

    /**
     * Get all items
     * @summary Get all items
     * @return All items
     */
    @GET
    @Path("/item")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Item> findAllItems();

    /**
     * Get the item with the specified id
     * @summary Get the item with the specified id
     * @param itemId The item id
     * @return The item with the specified id
     */
    @GET
    @Path("/item/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Item findItem(@PathParam("id") Long itemId);

    /**
     * Create a new item.
     * @summary Create a new item
     * @param item The item that will be created
     */
    @POST
    @Path("/item")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void createItem(Item item);

    /**
     * Update item name and description.
     * @summary Update item details
     * @param itemId The id of the item that will be updated
     * @param item The item details
     */
    @PUT
    @Path("/item/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void updateItem(@PathParam("id") Long itemId, Item item);

    /**
     * Deletes item with given id.
     * @summary Delete item with given id
     * @param itemId The id of the item to be deleted
     */
    @DELETE
    @Path("/item/{id}")
    public void removeItem(@PathParam("id") Long itemId);
}
