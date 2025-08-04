# DefaultApi

All URIs are relative to *http://0.0.0.0:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiV1NormalCitiesStateIdGet**](DefaultApi.md#apiV1NormalCitiesStateIdGet) | **GET** /api/v1/normal/cities/{stateId} | Get Cities by State ID |
| [**apiV1NormalCountriesGet**](DefaultApi.md#apiV1NormalCountriesGet) | **GET** /api/v1/normal/countries | Get All Countries |
| [**apiV1NormalGetCategoriesGet**](DefaultApi.md#apiV1NormalGetCategoriesGet) | **GET** /api/v1/normal/get_categories | Get All Categories |
| [**apiV1NormalLoginPost**](DefaultApi.md#apiV1NormalLoginPost) | **POST** /api/v1/normal/login | User Login |
| [**apiV1NormalRefreshTokenPost**](DefaultApi.md#apiV1NormalRefreshTokenPost) | **POST** /api/v1/normal/refresh-token | Refresh Access Token |
| [**apiV1NormalRegisterPost**](DefaultApi.md#apiV1NormalRegisterPost) | **POST** /api/v1/normal/register | Register a new user |
| [**apiV1NormalRequestPasswordResetPost**](DefaultApi.md#apiV1NormalRequestPasswordResetPost) | **POST** /api/v1/normal/request-password-reset | Request Password Reset |
| [**apiV1NormalResendOtpPost**](DefaultApi.md#apiV1NormalResendOtpPost) | **POST** /api/v1/normal/resend-otp | Resend OTP for Password Reset |
| [**apiV1NormalResetPasswordPost**](DefaultApi.md#apiV1NormalResetPasswordPost) | **POST** /api/v1/normal/reset-password | Reset Password |
| [**apiV1NormalStatesCountryIdGet**](DefaultApi.md#apiV1NormalStatesCountryIdGet) | **GET** /api/v1/normal/states/{countryId} | Get States by Country ID |
| [**apiV1ProtectedAddProductPicturePut**](DefaultApi.md#apiV1ProtectedAddProductPicturePut) | **PUT** /api/v1/protected/add-product-picture | Add Product Picture |
| [**apiV1ProtectedAddProductPost**](DefaultApi.md#apiV1ProtectedAddProductPost) | **POST** /api/v1/protected/add-product | Add a New Product |
| [**apiV1ProtectedDeleteProductDelete**](DefaultApi.md#apiV1ProtectedDeleteProductDelete) | **DELETE** /api/v1/protected/delete-product | Delete Product |
| [**apiV1ProtectedProductDetailsGet**](DefaultApi.md#apiV1ProtectedProductDetailsGet) | **GET** /api/v1/protected/product-details | Get Product Details |
| [**apiV1ProtectedProductListGet**](DefaultApi.md#apiV1ProtectedProductListGet) | **GET** /api/v1/protected/product-list | Get Product List |
| [**apiV1ProtectedProfileGet**](DefaultApi.md#apiV1ProtectedProfileGet) | **GET** /api/v1/protected/profile | Get User Profile |
| [**apiV1ProtectedUpdatePasswordPut**](DefaultApi.md#apiV1ProtectedUpdatePasswordPut) | **PUT** /api/v1/protected/update-password | Update User Password |
| [**apiV1ProtectedUpdateProductPut**](DefaultApi.md#apiV1ProtectedUpdateProductPut) | **PUT** /api/v1/protected/update-product | Update Product Details |
| [**apiV1ProtectedUpdateProfileDetailsPut**](DefaultApi.md#apiV1ProtectedUpdateProfileDetailsPut) | **PUT** /api/v1/protected/update-profile-details | Update User Profile Details |
| [**apiV1ProtectedUpdateProfilePicturePut**](DefaultApi.md#apiV1ProtectedUpdateProfilePicturePut) | **PUT** /api/v1/protected/update-profile-picture | Update User Profile Picture |


<a id="apiV1NormalCitiesStateIdGet"></a>
# **apiV1NormalCitiesStateIdGet**
> List&lt;City&gt; apiV1NormalCitiesStateIdGet(stateId)

Get Cities by State ID

Fetches a list of cities for the specified state UUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID stateId = UUID.fromString("223e4567-e89b-12d3-a456-426614174111"); // UUID | UUID of the state
    try {
      List<City> result = apiInstance.apiV1NormalCitiesStateIdGet(stateId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalCitiesStateIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **stateId** | **UUID**| UUID of the state | |

### Return type

[**List&lt;City&gt;**](City.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of cities retrieved successfully. |  -  |
| **400** | Bad Request - Missing or invalid stateId parameter. |  -  |
| **404** | No cities found for given state ID. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalCountriesGet"></a>
# **apiV1NormalCountriesGet**
> List&lt;Country&gt; apiV1NormalCountriesGet()

Get All Countries

Fetches a list of all countries.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Country> result = apiInstance.apiV1NormalCountriesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalCountriesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Country&gt;**](Country.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of countries retrieved successfully. |  -  |
| **404** | No data found |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalGetCategoriesGet"></a>
# **apiV1NormalGetCategoriesGet**
> List&lt;Category&gt; apiV1NormalGetCategoriesGet()

Get All Categories

Fetches a list of all categories.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Category> result = apiInstance.apiV1NormalGetCategoriesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalGetCategoriesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Category&gt;**](Category.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of categories retrieved successfully. |  -  |
| **404** | No data found |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalLoginPost"></a>
# **apiV1NormalLoginPost**
> LoginResponse apiV1NormalLoginPost(userLoginDto)

User Login

Authenticates a user and returns access and refresh tokens.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UserLoginDto userLoginDto = new UserLoginDto(); // UserLoginDto | 
    try {
      LoginResponse result = apiInstance.apiV1NormalLoginPost(userLoginDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalLoginPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userLoginDto** | [**UserLoginDto**](UserLoginDto.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Login successful, returns access and refresh tokens. |  -  |
| **400** | Bad Request - Invalid credentials. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalRefreshTokenPost"></a>
# **apiV1NormalRefreshTokenPost**
> TokenRefreshResponseDto apiV1NormalRefreshTokenPost(tokenRefreshRequestDto)

Refresh Access Token

Generates a new access and refresh token using a valid refresh token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    TokenRefreshRequestDto tokenRefreshRequestDto = new TokenRefreshRequestDto(); // TokenRefreshRequestDto | 
    try {
      TokenRefreshResponseDto result = apiInstance.apiV1NormalRefreshTokenPost(tokenRefreshRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalRefreshTokenPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tokenRefreshRequestDto** | [**TokenRefreshRequestDto**](TokenRefreshRequestDto.md)|  | |

### Return type

[**TokenRefreshResponseDto**](TokenRefreshResponseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tokens refreshed successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or expired refresh token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalRegisterPost"></a>
# **apiV1NormalRegisterPost**
> ApiV1NormalRegisterPost201Response apiV1NormalRegisterPost(name, email, password, mobileNo, country, state, city, photo)

Register a new user

Registers a new user with provided details and optional profile photo.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String name = "name_example"; // String | 
    String email = "email_example"; // String | 
    String password = "password_example"; // String | 
    String mobileNo = "mobileNo_example"; // String | 
    String country = "country_example"; // String | 
    String state = "state_example"; // String | 
    String city = "city_example"; // String | 
    File photo = new File("/path/to/file"); // File | 
    try {
      ApiV1NormalRegisterPost201Response result = apiInstance.apiV1NormalRegisterPost(name, email, password, mobileNo, country, state, city, photo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalRegisterPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**|  | |
| **email** | **String**|  | |
| **password** | **String**|  | |
| **mobileNo** | **String**|  | |
| **country** | **String**|  | |
| **state** | **String**|  | |
| **city** | **String**|  | |
| **photo** | **File**|  | [optional] |

### Return type

[**ApiV1NormalRegisterPost201Response**](ApiV1NormalRegisterPost201Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User created successfully. |  -  |
| **400** | Bad Request - Validation errors or photo upload failed. |  -  |
| **409** | Conflict - User already exists. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalRequestPasswordResetPost"></a>
# **apiV1NormalRequestPasswordResetPost**
> ApiV1NormalRequestPasswordResetPost200Response apiV1NormalRequestPasswordResetPost(passwordResetRequestDto)

Request Password Reset

Sends an OTP to the user&#39;s email for password reset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PasswordResetRequestDto passwordResetRequestDto = new PasswordResetRequestDto(); // PasswordResetRequestDto | 
    try {
      ApiV1NormalRequestPasswordResetPost200Response result = apiInstance.apiV1NormalRequestPasswordResetPost(passwordResetRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalRequestPasswordResetPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordResetRequestDto** | [**PasswordResetRequestDto**](PasswordResetRequestDto.md)|  | |

### Return type

[**ApiV1NormalRequestPasswordResetPost200Response**](ApiV1NormalRequestPasswordResetPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OTP sent successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalResendOtpPost"></a>
# **apiV1NormalResendOtpPost**
> ApiV1NormalResendOtpPost200Response apiV1NormalResendOtpPost(passwordResetRequestDto)

Resend OTP for Password Reset

Resends an OTP to the user&#39;s email for password reset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PasswordResetRequestDto passwordResetRequestDto = new PasswordResetRequestDto(); // PasswordResetRequestDto | 
    try {
      ApiV1NormalResendOtpPost200Response result = apiInstance.apiV1NormalResendOtpPost(passwordResetRequestDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalResendOtpPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordResetRequestDto** | [**PasswordResetRequestDto**](PasswordResetRequestDto.md)|  | |

### Return type

[**ApiV1NormalResendOtpPost200Response**](ApiV1NormalResendOtpPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OTP resent successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **404** | User not found. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalResetPasswordPost"></a>
# **apiV1NormalResetPasswordPost**
> ApiV1NormalResetPasswordPost200Response apiV1NormalResetPasswordPost(passwordResetVerifyDto)

Reset Password

Resets the user&#39;s password using the provided OTP.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    PasswordResetVerifyDto passwordResetVerifyDto = new PasswordResetVerifyDto(); // PasswordResetVerifyDto | 
    try {
      ApiV1NormalResetPasswordPost200Response result = apiInstance.apiV1NormalResetPasswordPost(passwordResetVerifyDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalResetPasswordPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **passwordResetVerifyDto** | [**PasswordResetVerifyDto**](PasswordResetVerifyDto.md)|  | |

### Return type

[**ApiV1NormalResetPasswordPost200Response**](ApiV1NormalResetPasswordPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Password reset successful. |  -  |
| **400** | Bad Request - Invalid OTP or validation errors. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1NormalStatesCountryIdGet"></a>
# **apiV1NormalStatesCountryIdGet**
> List&lt;State&gt; apiV1NormalStatesCountryIdGet(countryId)

Get States by Country ID

Fetches a list of states for the specified country UUID.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID countryId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | UUID of the country
    try {
      List<State> result = apiInstance.apiV1NormalStatesCountryIdGet(countryId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1NormalStatesCountryIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **countryId** | **UUID**| UUID of the country | |

### Return type

[**List&lt;State&gt;**](State.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of states retrieved successfully. |  -  |
| **400** | Bad Request - Missing or invalid countryId parameter. |  -  |
| **404** | No states found for given country ID. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedAddProductPicturePut"></a>
# **apiV1ProtectedAddProductPicturePut**
> ApiV1ProtectedAddProductPicturePut200Response apiV1ProtectedAddProductPicturePut(productId, photo)

Add Product Picture

Adds a new picture to an existing product.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID productId = UUID.randomUUID(); // UUID | 
    File photo = new File("/path/to/file"); // File | 
    try {
      ApiV1ProtectedAddProductPicturePut200Response result = apiInstance.apiV1ProtectedAddProductPicturePut(productId, photo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedAddProductPicturePut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productId** | **UUID**|  | |
| **photo** | **File**|  | |

### Return type

[**ApiV1ProtectedAddProductPicturePut200Response**](ApiV1ProtectedAddProductPicturePut200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Picture added successfully. |  -  |
| **400** | Bad Request - Missing parameters. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedAddProductPost"></a>
# **apiV1ProtectedAddProductPost**
> ApiV1ProtectedAddProductPost201Response apiV1ProtectedAddProductPost(productName, category, description, price, tillDate, country, state, city, picture, files, active)

Add a New Product

Adds a new product with details and optional images.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String productName = "productName_example"; // String | 
    String category = "category_example"; // String | 
    String description = "description_example"; // String | 
    Double price = 3.4D; // Double | 
    String tillDate = "tillDate_example"; // String | 
    String country = "country_example"; // String | 
    String state = "state_example"; // String | 
    String city = "city_example"; // String | 
    File picture = new File("/path/to/file"); // File | 
    List<File> files = Arrays.asList(); // List<File> | 
    Boolean active = true; // Boolean | 
    try {
      ApiV1ProtectedAddProductPost201Response result = apiInstance.apiV1ProtectedAddProductPost(productName, category, description, price, tillDate, country, state, city, picture, files, active);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedAddProductPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productName** | **String**|  | |
| **category** | **String**|  | |
| **description** | **String**|  | |
| **price** | **Double**|  | |
| **tillDate** | **String**|  | |
| **country** | **String**|  | |
| **state** | **String**|  | |
| **city** | **String**|  | |
| **picture** | **File**|  | [optional] |
| **files** | **List&lt;File&gt;**|  | [optional] |
| **active** | **Boolean**|  | [optional] |

### Return type

[**ApiV1ProtectedAddProductPost201Response**](ApiV1ProtectedAddProductPost201Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Product added successfully. |  -  |
| **202** | Product added, but some images failed to upload. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedDeleteProductDelete"></a>
# **apiV1ProtectedDeleteProductDelete**
> ApiV1ProtectedDeleteProductDelete200Response apiV1ProtectedDeleteProductDelete(productDetailsDto)

Delete Product

Deletes a specific product and its associated pictures.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProductDetailsDto productDetailsDto = new ProductDetailsDto(); // ProductDetailsDto | 
    try {
      ApiV1ProtectedDeleteProductDelete200Response result = apiInstance.apiV1ProtectedDeleteProductDelete(productDetailsDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedDeleteProductDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productDetailsDto** | [**ProductDetailsDto**](ProductDetailsDto.md)|  | |

### Return type

[**ApiV1ProtectedDeleteProductDelete200Response**](ApiV1ProtectedDeleteProductDelete200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product deleted successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedProductDetailsGet"></a>
# **apiV1ProtectedProductDetailsGet**
> Product apiV1ProtectedProductDetailsGet(productDetailsDto)

Get Product Details

Fetches details of a specific product.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    ProductDetailsDto productDetailsDto = new ProductDetailsDto(); // ProductDetailsDto | 
    try {
      Product result = apiInstance.apiV1ProtectedProductDetailsGet(productDetailsDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedProductDetailsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productDetailsDto** | [**ProductDetailsDto**](ProductDetailsDto.md)|  | |

### Return type

[**Product**](Product.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product details retrieved successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedProductListGet"></a>
# **apiV1ProtectedProductListGet**
> List&lt;Product&gt; apiV1ProtectedProductListGet()

Get Product List

Fetches a list of all products.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      List<Product> result = apiInstance.apiV1ProtectedProductListGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedProductListGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of products retrieved successfully. |  -  |
| **204** | No products found. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedProfileGet"></a>
# **apiV1ProtectedProfileGet**
> User apiV1ProtectedProfileGet()

Get User Profile

Fetches the profile details of the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    try {
      User result = apiInstance.apiV1ProtectedProfileGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedProfileGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**User**](User.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User profile retrieved successfully. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **404** | User not found. |  -  |

<a id="apiV1ProtectedUpdatePasswordPut"></a>
# **apiV1ProtectedUpdatePasswordPut**
> ApiV1ProtectedUpdatePasswordPut200Response apiV1ProtectedUpdatePasswordPut(updatePasswordDto)

Update User Password

Updates the password of the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UpdatePasswordDto updatePasswordDto = new UpdatePasswordDto(); // UpdatePasswordDto | 
    try {
      ApiV1ProtectedUpdatePasswordPut200Response result = apiInstance.apiV1ProtectedUpdatePasswordPut(updatePasswordDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedUpdatePasswordPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updatePasswordDto** | [**UpdatePasswordDto**](UpdatePasswordDto.md)|  | |

### Return type

[**ApiV1ProtectedUpdatePasswordPut200Response**](ApiV1ProtectedUpdatePasswordPut200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Password updated successfully. |  -  |
| **400** | Bad Request - Validation errors or incorrect old password. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedUpdateProductPut"></a>
# **apiV1ProtectedUpdateProductPut**
> ApiV1ProtectedUpdateProductPut200Response apiV1ProtectedUpdateProductPut(updateProductDto)

Update Product Details

Updates the details of a specific product.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UpdateProductDto updateProductDto = new UpdateProductDto(); // UpdateProductDto | 
    try {
      ApiV1ProtectedUpdateProductPut200Response result = apiInstance.apiV1ProtectedUpdateProductPut(updateProductDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedUpdateProductPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateProductDto** | [**UpdateProductDto**](UpdateProductDto.md)|  | |

### Return type

[**ApiV1ProtectedUpdateProductPut200Response**](ApiV1ProtectedUpdateProductPut200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Product updated successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedUpdateProfileDetailsPut"></a>
# **apiV1ProtectedUpdateProfileDetailsPut**
> ApiV1ProtectedUpdateProfileDetailsPut200Response apiV1ProtectedUpdateProfileDetailsPut(updateProfileDetailsDto)

Update User Profile Details

Updates the profile details of the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UpdateProfileDetailsDto updateProfileDetailsDto = new UpdateProfileDetailsDto(); // UpdateProfileDetailsDto | 
    try {
      ApiV1ProtectedUpdateProfileDetailsPut200Response result = apiInstance.apiV1ProtectedUpdateProfileDetailsPut(updateProfileDetailsDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedUpdateProfileDetailsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **updateProfileDetailsDto** | [**UpdateProfileDetailsDto**](UpdateProfileDetailsDto.md)|  | |

### Return type

[**ApiV1ProtectedUpdateProfileDetailsPut200Response**](ApiV1ProtectedUpdateProfileDetailsPut200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile details updated successfully. |  -  |
| **400** | Bad Request - Validation errors. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

<a id="apiV1ProtectedUpdateProfilePicturePut"></a>
# **apiV1ProtectedUpdateProfilePicturePut**
> ApiV1ProtectedUpdateProfilePicturePut200Response apiV1ProtectedUpdateProfilePicturePut(photo)

Update User Profile Picture

Updates the profile picture of the authenticated user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://0.0.0.0:8080");
    
    // Configure HTTP bearer authorization: BearerAuth
    HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    File photo = new File("/path/to/file"); // File | 
    try {
      ApiV1ProtectedUpdateProfilePicturePut200Response result = apiInstance.apiV1ProtectedUpdateProfilePicturePut(photo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#apiV1ProtectedUpdateProfilePicturePut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **photo** | **File**|  | |

### Return type

[**ApiV1ProtectedUpdateProfilePicturePut200Response**](ApiV1ProtectedUpdateProfilePicturePut200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile picture updated successfully. |  -  |
| **400** | Bad Request - Missing or invalid photo. |  -  |
| **401** | Unauthorized - Invalid or missing token. |  -  |
| **500** | Internal Server Error |  -  |

