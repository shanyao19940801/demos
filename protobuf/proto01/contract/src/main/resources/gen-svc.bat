@echo off

SetLocal EnableDelayedExpansion

set PROTO_BASE=%cd%\protobuf-sub
java -jar %PROTO_BASE%/protobuf-helper.jar protobuf-sub

EndLocal

PAUSE
