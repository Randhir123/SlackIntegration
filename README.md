# Send messages to Slack

```
Jun 01, 2024 5:13:46 AM org.glassfish.jersey.client.innate.inject.NonInjectionManager <init>
WARNING: Falling back to injection-less client.
Jun 01, 2024 5:13:47 AM org.glassfish.jersey.logging.LoggingInterceptor log
INFO: 1 * Sending client request on thread main
1 > POST https://hooks.slack.com/services/XXXX
1 > Accept: application/json
1 > Accept-Encoding: UTF-8
1 > Content-Type: application/json
{"text":"{\"id\":\"1\",\"source\":\"SI\",\"name\":\"Ransomware Alert\",\"details\":\"123\"}"}

Jun 01, 2024 5:13:47 AM org.glassfish.jersey.logging.LoggingInterceptor log
INFO: 1 * Client response received on thread main
1 < 200
1 < access-control-allow-origin: *
1 < content-length: 2
1 < content-type: text/html
1 < date: Fri, 31 May 2024 23:43:47 GMT
1 < referrer-policy: no-referrer
1 < server: Apache
1 < strict-transport-security: max-age=31536000; includeSubDomains; preload
1 < vary: Accept-Encoding
1 < via: 1.1 slack-prod.tinyspeck.com, envoy-www-iad-nvkphqdz, envoy-edge-canary-bom-hymqoqzd
1 < x-backend: main_normal main_canary_with_overflow main_control_with_overflow
1 < x-edge-backend: envoy-www
1 < x-envoy-attempt-count: 1
1 < x-envoy-upstream-service-time: 235
1 < x-frame-options: SAMEORIGIN
1 < x-server: slack-www-hhvm-main-iad-kgmh
1 < x-slack-backend: r
1 < x-slack-edge-shared-secret-outcome: no-match
1 < x-slack-shared-secret-outcome: no-match
1 < x-slack-unique-id: Zlpgs49S2iDdn326GsSrpAAAABs
ok

InboundJaxrsResponse{context=ClientResponse{method=POST, uri=https://hooks.slack.com/services/XXXX, status=200, reason=OK}}
```
