package io.vertx.kotlin.ext.auth.oauth2

import io.vertx.ext.auth.oauth2.OAuth2ClientOptions
import io.vertx.core.http.Http2Settings
import io.vertx.core.http.HttpVersion
import io.vertx.core.net.JdkSSLEngineOptions
import io.vertx.core.net.JksOptions
import io.vertx.core.net.OpenSSLEngineOptions
import io.vertx.core.net.PemKeyCertOptions
import io.vertx.core.net.PemTrustOptions
import io.vertx.core.net.PfxOptions
import io.vertx.core.net.ProxyOptions
import io.vertx.ext.auth.PubSecKeyOptions
import io.vertx.ext.jwt.JWTOptions

/**
 * A function providing a DSL for building [io.vertx.ext.auth.oauth2.OAuth2ClientOptions] objects.
 *
 * Options describing how an OAuth2  will make connections.
 *
 * @param alpnVersions  Set the list of protocol versions to provide to the server during the Application-Layer Protocol Negotiation. When the list is empty, the client provides a best effort list according to [io.vertx.core.http.HttpClientOptions]: <ul>   <li>: [ "h2", "http/1.1" ]</li>   <li>otherwise: [[io.vertx.core.http.HttpClientOptions]]</li> </ul>
 * @param authorizationPath  Get the Oauth2 authorization resource path. e.g.: /oauth/authorize
 * @param clientID  Set the provider client id
 * @param clientSecret  Set the provider client secret
 * @param clientSecretParameterName  Override the HTTP form field name for client secret
 * @param connectTimeout  Set the connect timeout
 * @param crlPaths  Add a CRL path
 * @param crlValues  Add a CRL value
 * @param decoderInitialBufferSize  set to <code>initialBufferSizeHttpDecoder</code> the initial buffer of the HttpDecoder.
 * @param defaultHost  Set the default host name to be used by this client in requests if none is provided when making the request.
 * @param defaultPort  Set the default port to be used by this client in requests if none is provided when making the request.
 * @param enabledCipherSuites  Add an enabled cipher suite, appended to the ordered suites.
 * @param enabledSecureTransportProtocols  Sets the list of enabled SSL/TLS protocols.
 * @param extraParameters  Set extra parameters to be sent to the provider on each request
 * @param forceSni  By default, the server name is only sent for Fully Qualified Domain Name (FQDN), setting this property to <code>true</code> forces the server name to be always sent.
 * @param headers  Set custom headers to be sent with every request to the provider
 * @param http2ClearTextUpgrade  Set to <code>true</code> when an <i>h2c</i> connection is established using an HTTP/1.1 upgrade request, and <code>false</code> when an <i>h2c</i> connection is established directly (with prior knowledge).
 * @param http2ConnectionWindowSize  Set the default HTTP/2 connection window size. It overrides the initial window size set by , so the connection window size is greater than for its streams, in order the data throughput. <p/> A value of <code>-1</code> reuses the initial window size setting.
 * @param http2MaxPoolSize  Set the maximum pool size for HTTP/2 connections
 * @param http2MultiplexingLimit  Set a client limit of the number concurrent streams for each HTTP/2 connection, this limits the number of streams the client can create for a connection. The effective number of streams for a connection is the min of this value and the server's initial settings. <p/> Setting the value to <code>-1</code> means to use the value sent by the server's initial settings. <code>-1</code> is the default value.
 * @param idleTimeout  Set the idle timeout, in seconds. zero means don't timeout. This determines if a connection will timeout and be closed if no data is received within the timeout.
 * @param initialSettings  Set the HTTP/2 connection settings immediately sent by to the server when the client connects.
 * @param introspectionPath  Set the provider token introspection resource path
 * @param jdkSslEngineOptions 
 * @param jwkPath 
 * @param jwtOptions 
 * @param jwtToken 
 * @param keepAlive  Set whether keep alive is enabled on the client
 * @param keyStoreOptions  Set the key/cert options in jks format, aka Java keystore.
 * @param localAddress  Set the local interface to bind for network connections. When the local address is null, it will pick any local address, the default local address is null.
 * @param logActivity  Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.
 * @param logoutPath  Set the provider logout path
 * @param maxChunkSize  Set the maximum HTTP chunk size
 * @param maxHeaderSize  Set the maximum length of all headers for HTTP/1.x .
 * @param maxInitialLineLength  Set the maximum length of the initial line for HTTP/1.x (e.g. <code>"HTTP/1.1 200 OK"</code>)
 * @param maxPoolSize  Set the maximum pool size for connections
 * @param maxRedirects  Set to <code>maxRedirects</code> the maximum number of redirection a request can follow.
 * @param maxWaitQueueSize  Set the maximum requests allowed in the wait queue, any requests beyond the max size will result in a ConnectionPoolTooBusyException.  If the value is set to a negative number then the queue will be unbounded.
 * @param maxWebsocketFrameSize  Set the max websocket frame size
 * @param maxWebsocketMessageSize  Set the max websocket message size
 * @param metricsName  Set the metrics name identifying the reported metrics, useful for grouping metrics with the same name.
 * @param openSslEngineOptions 
 * @param pemKeyCertOptions  Set the key/cert store options in pem format.
 * @param pemTrustOptions  Set the trust options in pem format
 * @param pfxKeyCertOptions  Set the key/cert options in pfx format.
 * @param pfxTrustOptions  Set the trust options in pfx format
 * @param pipelining  Set whether pipe-lining is enabled on the client
 * @param pipeliningLimit  Set the limit of pending requests a pipe-lined HTTP/1 connection can send.
 * @param protocolVersion  Set the protocol version.
 * @param proxyOptions  Set proxy options for connections via CONNECT proxy (e.g. Squid) or a SOCKS proxy.
 * @param pubSecKeys  The provider PubSec key options
 * @param receiveBufferSize  Set the TCP receive buffer size
 * @param reuseAddress  Set the value of reuse address
 * @param reusePort  Set the value of reuse port. <p/> This is only supported by native transports.
 * @param revocationPath  Set the Oauth2 revocation resource path. e.g.: /oauth/revoke
 * @param scopeSeparator  Set the provider scope separator
 * @param sendBufferSize  Set the TCP send buffer size
 * @param sendUnmaskedFrames  Set true when the client wants to skip frame masking. You may want to set it true on server by server websocket communication: In this case you are by passing RFC6455 protocol. It's false as default.
 * @param site  Root URL for the provider
 * @param soLinger  Set whether SO_linger keep alive is enabled
 * @param ssl  Set whether SSL/TLS is enabled
 * @param tcpCork  Enable the <code>TCP_CORK</code> option - only with linux native transport.
 * @param tcpFastOpen  Enable the <code>TCP_FASTOPEN</code> option - only with linux native transport.
 * @param tcpKeepAlive  Set whether TCP keep alive is enabled
 * @param tcpNoDelay  Set whether TCP no delay is enabled
 * @param tcpQuickAck  Enable the <code>TCP_QUICKACK</code> option - only with linux native transport.
 * @param tokenPath  Get the Oauth2 token resource path. e.g.: /oauth/token
 * @param trafficClass  Set the value of traffic class
 * @param trustAll  Set whether all server certificates should be trusted
 * @param trustStoreOptions  Set the trust options in jks format, aka Java truststore
 * @param tryUseCompression  Set whether compression is enabled
 * @param useAlpn  Set the ALPN usage.
 * @param useBasicAuthorizationHeader  Flag to use HTTP basic auth header with client id, client secret.
 * @param usePooledBuffers  Set whether Netty pooled buffers are enabled
 * @param userAgent  Set a custom user agent to use when communicating to a provider
 * @param userInfoParameters  Set custom parameters to be sent during the userInfo resource request
 * @param userInfoPath  Set the provider userInfo resource path
 * @param verifyHost  Set whether hostname verification is enabled
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.ext.auth.oauth2.OAuth2ClientOptions original] using Vert.x codegen.
 */
fun OAuth2ClientOptions(
  alpnVersions: Iterable<HttpVersion>? = null,
  authorizationPath: String? = null,
  clientID: String? = null,
  clientSecret: String? = null,
  clientSecretParameterName: String? = null,
  connectTimeout: Int? = null,
  crlPaths: Iterable<String>? = null,
  crlValues: Iterable<io.vertx.core.buffer.Buffer>? = null,
  decoderInitialBufferSize: Int? = null,
  defaultHost: String? = null,
  defaultPort: Int? = null,
  enabledCipherSuites: Iterable<String>? = null,
  enabledSecureTransportProtocols: Iterable<String>? = null,
  extraParameters: io.vertx.core.json.JsonObject? = null,
  forceSni: Boolean? = null,
  headers: io.vertx.core.json.JsonObject? = null,
  http2ClearTextUpgrade: Boolean? = null,
  http2ConnectionWindowSize: Int? = null,
  http2MaxPoolSize: Int? = null,
  http2MultiplexingLimit: Int? = null,
  idleTimeout: Int? = null,
  initialSettings: io.vertx.core.http.Http2Settings? = null,
  introspectionPath: String? = null,
  jdkSslEngineOptions: io.vertx.core.net.JdkSSLEngineOptions? = null,
  jwkPath: String? = null,
  jwtOptions: io.vertx.ext.jwt.JWTOptions? = null,
  jwtToken: Boolean? = null,
  keepAlive: Boolean? = null,
  keyStoreOptions: io.vertx.core.net.JksOptions? = null,
  localAddress: String? = null,
  logActivity: Boolean? = null,
  logoutPath: String? = null,
  maxChunkSize: Int? = null,
  maxHeaderSize: Int? = null,
  maxInitialLineLength: Int? = null,
  maxPoolSize: Int? = null,
  maxRedirects: Int? = null,
  maxWaitQueueSize: Int? = null,
  maxWebsocketFrameSize: Int? = null,
  maxWebsocketMessageSize: Int? = null,
  metricsName: String? = null,
  openSslEngineOptions: io.vertx.core.net.OpenSSLEngineOptions? = null,
  pemKeyCertOptions: io.vertx.core.net.PemKeyCertOptions? = null,
  pemTrustOptions: io.vertx.core.net.PemTrustOptions? = null,
  pfxKeyCertOptions: io.vertx.core.net.PfxOptions? = null,
  pfxTrustOptions: io.vertx.core.net.PfxOptions? = null,
  pipelining: Boolean? = null,
  pipeliningLimit: Int? = null,
  protocolVersion: HttpVersion? = null,
  proxyOptions: io.vertx.core.net.ProxyOptions? = null,
  pubSecKeys: Iterable<io.vertx.ext.auth.PubSecKeyOptions>? = null,
  receiveBufferSize: Int? = null,
  reuseAddress: Boolean? = null,
  reusePort: Boolean? = null,
  revocationPath: String? = null,
  scopeSeparator: String? = null,
  sendBufferSize: Int? = null,
  sendUnmaskedFrames: Boolean? = null,
  site: String? = null,
  soLinger: Int? = null,
  ssl: Boolean? = null,
  tcpCork: Boolean? = null,
  tcpFastOpen: Boolean? = null,
  tcpKeepAlive: Boolean? = null,
  tcpNoDelay: Boolean? = null,
  tcpQuickAck: Boolean? = null,
  tokenPath: String? = null,
  trafficClass: Int? = null,
  trustAll: Boolean? = null,
  trustStoreOptions: io.vertx.core.net.JksOptions? = null,
  tryUseCompression: Boolean? = null,
  useAlpn: Boolean? = null,
  useBasicAuthorizationHeader: Boolean? = null,
  usePooledBuffers: Boolean? = null,
  userAgent: String? = null,
  userInfoParameters: io.vertx.core.json.JsonObject? = null,
  userInfoPath: String? = null,
  verifyHost: Boolean? = null): OAuth2ClientOptions = io.vertx.ext.auth.oauth2.OAuth2ClientOptions().apply {

  if (alpnVersions != null) {
    this.setAlpnVersions(alpnVersions.toList())
  }
  if (authorizationPath != null) {
    this.setAuthorizationPath(authorizationPath)
  }
  if (clientID != null) {
    this.setClientID(clientID)
  }
  if (clientSecret != null) {
    this.setClientSecret(clientSecret)
  }
  if (clientSecretParameterName != null) {
    this.setClientSecretParameterName(clientSecretParameterName)
  }
  if (connectTimeout != null) {
    this.setConnectTimeout(connectTimeout)
  }
  if (crlPaths != null) {
    for (item in crlPaths) {
      this.addCrlPath(item)
    }
  }
  if (crlValues != null) {
    for (item in crlValues) {
      this.addCrlValue(item)
    }
  }
  if (decoderInitialBufferSize != null) {
    this.setDecoderInitialBufferSize(decoderInitialBufferSize)
  }
  if (defaultHost != null) {
    this.setDefaultHost(defaultHost)
  }
  if (defaultPort != null) {
    this.setDefaultPort(defaultPort)
  }
  if (enabledCipherSuites != null) {
    for (item in enabledCipherSuites) {
      this.addEnabledCipherSuite(item)
    }
  }
  if (enabledSecureTransportProtocols != null) {
    this.setEnabledSecureTransportProtocols(enabledSecureTransportProtocols.toSet())
  }
  if (extraParameters != null) {
    this.setExtraParameters(extraParameters)
  }
  if (forceSni != null) {
    this.setForceSni(forceSni)
  }
  if (headers != null) {
    this.setHeaders(headers)
  }
  if (http2ClearTextUpgrade != null) {
    this.setHttp2ClearTextUpgrade(http2ClearTextUpgrade)
  }
  if (http2ConnectionWindowSize != null) {
    this.setHttp2ConnectionWindowSize(http2ConnectionWindowSize)
  }
  if (http2MaxPoolSize != null) {
    this.setHttp2MaxPoolSize(http2MaxPoolSize)
  }
  if (http2MultiplexingLimit != null) {
    this.setHttp2MultiplexingLimit(http2MultiplexingLimit)
  }
  if (idleTimeout != null) {
    this.setIdleTimeout(idleTimeout)
  }
  if (initialSettings != null) {
    this.setInitialSettings(initialSettings)
  }
  if (introspectionPath != null) {
    this.setIntrospectionPath(introspectionPath)
  }
  if (jdkSslEngineOptions != null) {
    this.setJdkSslEngineOptions(jdkSslEngineOptions)
  }
  if (jwkPath != null) {
    this.setJwkPath(jwkPath)
  }
  if (jwtOptions != null) {
    this.setJWTOptions(jwtOptions)
  }
  if (jwtToken != null) {
    this.setJWTToken(jwtToken)
  }
  if (keepAlive != null) {
    this.setKeepAlive(keepAlive)
  }
  if (keyStoreOptions != null) {
    this.setKeyStoreOptions(keyStoreOptions)
  }
  if (localAddress != null) {
    this.setLocalAddress(localAddress)
  }
  if (logActivity != null) {
    this.setLogActivity(logActivity)
  }
  if (logoutPath != null) {
    this.setLogoutPath(logoutPath)
  }
  if (maxChunkSize != null) {
    this.setMaxChunkSize(maxChunkSize)
  }
  if (maxHeaderSize != null) {
    this.setMaxHeaderSize(maxHeaderSize)
  }
  if (maxInitialLineLength != null) {
    this.setMaxInitialLineLength(maxInitialLineLength)
  }
  if (maxPoolSize != null) {
    this.setMaxPoolSize(maxPoolSize)
  }
  if (maxRedirects != null) {
    this.setMaxRedirects(maxRedirects)
  }
  if (maxWaitQueueSize != null) {
    this.setMaxWaitQueueSize(maxWaitQueueSize)
  }
  if (maxWebsocketFrameSize != null) {
    this.setMaxWebsocketFrameSize(maxWebsocketFrameSize)
  }
  if (maxWebsocketMessageSize != null) {
    this.setMaxWebsocketMessageSize(maxWebsocketMessageSize)
  }
  if (metricsName != null) {
    this.setMetricsName(metricsName)
  }
  if (openSslEngineOptions != null) {
    this.setOpenSslEngineOptions(openSslEngineOptions)
  }
  if (pemKeyCertOptions != null) {
    this.setPemKeyCertOptions(pemKeyCertOptions)
  }
  if (pemTrustOptions != null) {
    this.setPemTrustOptions(pemTrustOptions)
  }
  if (pfxKeyCertOptions != null) {
    this.setPfxKeyCertOptions(pfxKeyCertOptions)
  }
  if (pfxTrustOptions != null) {
    this.setPfxTrustOptions(pfxTrustOptions)
  }
  if (pipelining != null) {
    this.setPipelining(pipelining)
  }
  if (pipeliningLimit != null) {
    this.setPipeliningLimit(pipeliningLimit)
  }
  if (protocolVersion != null) {
    this.setProtocolVersion(protocolVersion)
  }
  if (proxyOptions != null) {
    this.setProxyOptions(proxyOptions)
  }
  if (pubSecKeys != null) {
    this.setPubSecKeys(pubSecKeys.toList())
  }
  if (receiveBufferSize != null) {
    this.setReceiveBufferSize(receiveBufferSize)
  }
  if (reuseAddress != null) {
    this.setReuseAddress(reuseAddress)
  }
  if (reusePort != null) {
    this.setReusePort(reusePort)
  }
  if (revocationPath != null) {
    this.setRevocationPath(revocationPath)
  }
  if (scopeSeparator != null) {
    this.setScopeSeparator(scopeSeparator)
  }
  if (sendBufferSize != null) {
    this.setSendBufferSize(sendBufferSize)
  }
  if (sendUnmaskedFrames != null) {
    this.setSendUnmaskedFrames(sendUnmaskedFrames)
  }
  if (site != null) {
    this.setSite(site)
  }
  if (soLinger != null) {
    this.setSoLinger(soLinger)
  }
  if (ssl != null) {
    this.setSsl(ssl)
  }
  if (tcpCork != null) {
    this.setTcpCork(tcpCork)
  }
  if (tcpFastOpen != null) {
    this.setTcpFastOpen(tcpFastOpen)
  }
  if (tcpKeepAlive != null) {
    this.setTcpKeepAlive(tcpKeepAlive)
  }
  if (tcpNoDelay != null) {
    this.setTcpNoDelay(tcpNoDelay)
  }
  if (tcpQuickAck != null) {
    this.setTcpQuickAck(tcpQuickAck)
  }
  if (tokenPath != null) {
    this.setTokenPath(tokenPath)
  }
  if (trafficClass != null) {
    this.setTrafficClass(trafficClass)
  }
  if (trustAll != null) {
    this.setTrustAll(trustAll)
  }
  if (trustStoreOptions != null) {
    this.setTrustStoreOptions(trustStoreOptions)
  }
  if (tryUseCompression != null) {
    this.setTryUseCompression(tryUseCompression)
  }
  if (useAlpn != null) {
    this.setUseAlpn(useAlpn)
  }
  if (useBasicAuthorizationHeader != null) {
    this.setUseBasicAuthorizationHeader(useBasicAuthorizationHeader)
  }
  if (usePooledBuffers != null) {
    this.setUsePooledBuffers(usePooledBuffers)
  }
  if (userAgent != null) {
    this.setUserAgent(userAgent)
  }
  if (userInfoParameters != null) {
    this.setUserInfoParameters(userInfoParameters)
  }
  if (userInfoPath != null) {
    this.setUserInfoPath(userInfoPath)
  }
  if (verifyHost != null) {
    this.setVerifyHost(verifyHost)
  }
}

