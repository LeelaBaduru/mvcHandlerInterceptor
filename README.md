# mvcHandlerInterceptor
HandlerIntercepors,intercepts requests between the DispatcherServlet and Controllers.
Implemented CustomHandlerInterceptor class which overrides methods called preHandle(), postHandle() and afterCompletion() from HandlerInterceptor Interface
Interceptors reduces duplication and allows for more fine-grained functionality such Handling cross-cutting concerns such as application logging, Detailed authorization checks etc.,
